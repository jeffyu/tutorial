package net.familyyu.jeff.guice;

import net.familyyu.jeff.guice.model.User;

import com.google.inject.Inject;

public class UserServiceImpl implements UserService {
	
	private final UserDao userDao;
	
	@Inject
	public UserServiceImpl(@Debug UserDao userDao) {
		this.userDao = userDao;
	}

	public User createUser(User user) {
		return userDao.createUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void removeUser(User user) {
		userDao.removeUser(user);
	}

}
