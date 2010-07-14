/**
 * 
 */
package net.familyyu.jeff;

import java.sql.Connection;
import java.util.Map;


/**
 * @author jeffyu
 *
 */
public interface Database {
	
	public Map<String, Object> getProperties();
	
	public void start() throws Exception;
	
	public Connection getConnection();
	

}
