package org.jboss.resteasy.blog;

import org.jboss.resteasy.plugins.server.tjws.TJWSEmbeddedJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseTest extends Assert{
	
	protected static TJWSEmbeddedJaxrsServer server;
	
	protected static ResteasyDeployment deployment;
	
	protected static int port = 8081;
	
	@BeforeClass
	public static void initialize() throws Exception{
		server = new TJWSEmbeddedJaxrsServer();
		deployment = new ResteasyDeployment();
		server.setDeployment(deployment);
		server.setPort(port);
		server.start();
	}
	
	public void addPerRequestResource(Class<?> clazz) {
		deployment.getRegistry().addPerRequestResource(clazz);
	}
	
	@Test
	public void testNull() {
		
	}
	
	@AfterClass
	public static void destroy() throws Exception{
		if (server != null) {
			server.stop();
		}
		System.out.println("Destroy Done");
	}

}
