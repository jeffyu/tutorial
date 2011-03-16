package org.jboss.resteasy.blog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jboss.resteasy.blog.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest extends BaseTest {

	@Before
	public void setUp() throws Exception {
	   this.addPerRequestResource(UserServiceImpl.class);
	}
	
	@Test
	public void testGetUser() throws Exception {
		URL url = new URL("http://localhost:8081/user/100");
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
	
	@Test
	public void testCreateUser() throws Exception {
		URL url = new URL("http://localhost:8081/user");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/xml");
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("<user id=\"0\">");
		sbuffer.append("   <username>Test User</username>");
		sbuffer.append("   <email>test.user@test.com</email>");
		sbuffer.append("</user>");
		
		OutputStream os = connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();
		
	    assertEquals(HttpURLConnection.HTTP_CREATED, connection.getResponseCode());
		connection.disconnect();		
	}
	
}
