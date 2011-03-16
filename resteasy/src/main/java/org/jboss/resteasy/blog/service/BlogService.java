package org.jboss.resteasy.blog.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.resteasy.plugins.providers.atom.Feed;

public interface BlogService {

	@GET
	@Path("{id}")
	@Produces("application/atom+xml")
	public Feed getBlogEntry(@PathParam("id") long id);

}
