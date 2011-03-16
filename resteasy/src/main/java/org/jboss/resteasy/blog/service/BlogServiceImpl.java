package org.jboss.resteasy.blog.service;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;

import org.jboss.resteasy.blog.domain.Blog;
import org.jboss.resteasy.plugins.providers.atom.Feed;

@Path("/blog")
public class BlogServiceImpl implements BlogService {
	
    private Map<Long, Blog> blogDB = new ConcurrentHashMap<Long, Blog>();
    private AtomicLong idCounter = new AtomicLong();
    
    public BlogServiceImpl() {
    	Blog defaultBlog = new Blog();
    	defaultBlog.setId(100);
    	defaultBlog.setTitle("First Blog");
    	defaultBlog.setContent("First blog content");
    	defaultBlog.setCreatedDate(new Date());
    	
    	blogDB.put(Long.valueOf(100), defaultBlog);
    }
    
	public Feed getBlogEntry(long id) {
		Blog blog = blogDB.get(id);
		if (blog == null) {
			throw new WebApplicationException();
		}
		Feed feed = new Feed();
		feed.setTitle(blog.getTitle());
		feed.setSubtitle(blog.getContent());
		feed.setUpdated(blog.getCreatedDate());
		
		return feed;
	}

}
