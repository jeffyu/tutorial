/**
 * 
 */
package net.familyyu.jeff.guice.model;

import com.google.inject.Inject;

/**
 * 
 * 
 * @author jeffyu
 *
 */
public class DBConfig {
	
	private String jdbcUrl;
	
	private String username;
	
	private String password;
	
	@Inject
	public DBConfig(String jdbcUrl, String username, String password) {
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


}
