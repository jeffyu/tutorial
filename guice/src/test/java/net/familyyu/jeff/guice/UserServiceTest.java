package net.familyyu.jeff.guice;

import junit.framework.Assert;
import net.familyyu.jeff.guice.model.User;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class UserServiceTest {
	
	@Test
	public void userServiceTest() throws Exception {
		Injector injector = Guice.createInjector(new UserModule());
		UserService userService = injector.getInstance(UserService.class);
		
		User user = new User();
		user.setName("Jeff");
		
		User theUser = userService.createUser(user);
		Assert.assertEquals("Jeff", theUser.getName());
	}

}
