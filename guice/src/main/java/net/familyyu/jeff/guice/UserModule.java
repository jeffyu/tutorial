package net.familyyu.jeff.guice;

import net.familyyu.jeff.guice.model.DBConfig;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class UserModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDao.class).annotatedWith(Debug.class).to(DBUserDao.class);
		bind(UserService.class).to(UserServiceImpl.class);
	}
	
	@Provides
	DBConfig provideDBConfig() {
		DBConfig dbconfig = new DBConfig("jdbc:mysql://localhost/test", "jeff", "jeff");
		return dbconfig;
	}

}
