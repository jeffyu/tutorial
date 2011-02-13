/**
 * 
 */
package net.familyyu.jeff.guice;

import net.familyyu.jeff.guice.model.User;

/**
 * 
 * 
 * @author jeffyu
 *
 */
public interface UserService {
	
	User createUser(User user);
	
	void updateUser(User user);
	
	void removeUser(User user);
	
}
