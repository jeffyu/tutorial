package org.jboss.resteasy.blog.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.blog.domain.User;

public interface UserService {
		
	@GET
	@Path("{id}")
	@Produces({"application/xml"})
	public User getUser(@PathParam("id") long id);
	
	@POST
	@Consumes("application/xml")
	public Response addUser(User user);
	
}
