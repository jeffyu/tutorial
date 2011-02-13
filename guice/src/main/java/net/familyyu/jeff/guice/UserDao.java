package net.familyyu.jeff.guice;

import net.familyyu.jeff.guice.model.User;

public interface UserDao {
	
	User createUser(User user);

	void updateUser(User user);
	
	void removeUser(User user);
}
