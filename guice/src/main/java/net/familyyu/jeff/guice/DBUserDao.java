package net.familyyu.jeff.guice;

import com.google.inject.Inject;

import net.familyyu.jeff.guice.model.DBConfig;
import net.familyyu.jeff.guice.model.User;

public class DBUserDao implements UserDao {
	
	private final DBConfig dbconfig;
	
	@Inject
	private DBUserDao(DBConfig dbConfig) {
		this.dbconfig = dbConfig;
	}
	
	public User createUser(User user) {
		System.out.println("create user from DBUserDao...." + dbconfig.getJdbcUrl() );
		return user;
	}

	public void updateUser(User user) {
		System.out.println("update user from DBUserDao...." + dbconfig.getJdbcUrl() );
	}

	public void removeUser(User user) {
		System.out.println("remove user from DBUserDao...."+ dbconfig.getJdbcUrl() );
	}

}
