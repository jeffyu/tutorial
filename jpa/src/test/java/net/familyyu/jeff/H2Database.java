package net.familyyu.jeff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

public class H2Database implements Database {
	
	private Connection conn;
	
	public Map<String, Object> getProperties() {
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("hibernate.connection.driver_class", "org.h2.Driver");
		props.put("hibernate.connection.url", "jdbc:h2:target/db/h2");
		props.put("hibernate.connection.username", "sa");
		props.put("hibernate.connection.password", "");
		return props;
	}
	
	public void start() throws Exception {
		Class.forName("org.h2.Driver");
		this.conn = DriverManager.getConnection("jdbc:h2:target/db/h2", "sa", "");
	}
	
	public Connection getConnection() {
		return this.conn;
	}

}
