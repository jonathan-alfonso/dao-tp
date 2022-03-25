package main;

import dao.IUserDAO;
import dao.impl.DAOFactory;
import model.User;

public class UpdateUser2 {

	public static void main(String[] args) {
		IUserDAO userDAO = DAOFactory.getUserDao();
		User user2 = userDAO.find(2);
		
		// Mise à jour user 2
		if (user2 != null) {
			System.out.println("Before update : login (" + user2.getLogin() + ") & lastname (" + user2.getLastname() +")");
			user2.setLastname("Gates");
			user2.setLogin("bgates");
			userDAO.update(user2);
			System.out.println("After update : login (" + user2.getLogin() + ") & lastname (" + user2.getLastname() +")");
		}

	}

}
