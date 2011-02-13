package net.familyyu.jeff.guice;

import java.util.ArrayList;
import java.util.List;

import net.familyyu.jeff.guice.model.User;

public class UserDaoInMemory implements UserDao {
	
	private List<User> users = new ArrayList<User>();
	
	public User createUser(User user) {
		users.add(user);
		return user;
	}

	public void updateUser(User user) {

	}

	public void removeUser(User user) {
		users.remove(user);
	}

}
