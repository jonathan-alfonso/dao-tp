package main;

import dao.IUserDAO;
import dao.impl.DAOFactory;

public class DeleteAllUsers {

	public static void main(String[] args) {
		
		IUserDAO userDAO = DAOFactory.getUserDao();
		userDAO.delete();
		System.out.println("Suppression totale effectuée.");

	}

}
