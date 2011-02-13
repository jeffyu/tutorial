/**
 * 
 */
package net.familyyu.jeff.guice;

import net.familyyu.jeff.guice.model.User;

/**
 * @author jeffyu
 *
 */
public class UserDaoDebug implements UserDao {
	
	/* (non-Javadoc)
	 * @see net.familyyu.jeff.guice.UserDao#createUser(net.familyyu.jeff.guice.model.User)
	 */
	public User createUser(User user) {		
		System.out.println("create user.....");
		return user;
	}

	/* (non-Javadoc)
	 * @see net.familyyu.jeff.guice.UserDao#updateUser(net.familyyu.jeff.guice.model.User)
	 */
	public void updateUser(User user) {
		System.out.println("update user.....");
	}

	/* (non-Javadoc)
	 * @see net.familyyu.jeff.guice.UserDao#removeUser(net.familyyu.jeff.guice.model.User)
	 */
	public void removeUser(User user) {
		System.out.println("remove user.....");
	}

}
