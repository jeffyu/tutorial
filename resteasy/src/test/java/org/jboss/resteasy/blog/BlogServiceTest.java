package org.jboss.resteasy.blog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jboss.resteasy.blog.service.BlogServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class BlogServiceTest extends BaseTest {
	
	@Before
	public void setUp() throws Exception {
	   this.addPerRequestResource(BlogServiceImpl.class);
	}
	
	
	@Test
	public void testGetName() throws Exception {
		URL url = new URL("http://localhost:8081/blog/100");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
	
	    BufferedReader reader = new BufferedReader(new
	              InputStreamReader(connection.getInputStream()));	
	    String line = reader.readLine();
        while (line != null)
        {
         System.out.println(line);
         line = reader.readLine();
        }
		
		connection.disconnect();
	}

}
