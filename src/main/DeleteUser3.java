package main;

import dao.IUserDAO;
import dao.impl.DAOFactory;
import model.User;

public class DeleteUser3 {

	public static void main(String[] args) {
		IUserDAO userDAO = DAOFactory.getUserDao();
		User user3 = userDAO.find(3);
		
		if (user3 != null) {
			userDAO.delete(user3);
			System.out.println("User 3 deleted");
		}

	}

}
