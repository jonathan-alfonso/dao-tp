package dao;

import model.User;

/**
 * 
 * @author ajonathan
 *
 */

public interface IUserDAO extends IDAO<User> {
	
	public User findByLogin(String login);
}
