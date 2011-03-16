package org.jboss.resteasy.blog.service;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.blog.domain.User;

@Path("/user")
public class UserServiceImpl implements UserService{
	
    private Map<Long, User> userDB = new ConcurrentHashMap<Long, User>();
    private AtomicLong idCounter = new AtomicLong();
	
	public UserServiceImpl() {
		User user = new User();
		user.setId(100);
		user.setUsername("jeff.yuchang");
		user.setEmail("jeff.yuchang@jboss.org");
		userDB.put(Long.valueOf(100), user);
	}
	
	public Response addUser(User user) {
		user.setId(idCounter.getAndIncrement());
		userDB.put(user.getId(), user);
		System.out.println("Created done: id is " + user.getId());
		return Response.created(URI.create("/user/" + user.getId())).build();
	}
	
	public User getUser(long id) {
		final User user = userDB.get(Long.valueOf(id));
		if (null == user) {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return user;
	}

}
