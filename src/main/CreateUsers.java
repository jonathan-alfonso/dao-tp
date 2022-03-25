package main;

import model.User;
import service.UserService;

public class CreateUsers {

	public static void main(String[] args) {
		UserService userService = UserService.getInstance();
		
		User user1 = new User();
		user1.setFirstname("Nathalie");
		user1.setLastname("Forget");
		user1.setLogin("nforget");
		user1.setPwd("pwd1");
		
		User user2 = new User();
		user2.setFirstname("Bill");
		user2.setLastname("Buffalo");
		user2.setLogin("bbuffalo");
		user2.setPwd("pwd2");
		
		User user3 = new User();
		user3.setFirstname("John");
		user3.setLastname("Duff");
		user3.setLogin("jduff");
		user3.setPwd("pwd3");
		
		// On les persiste
		try {
			userService.createUser(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User 1 created with ID : " + user1.getId());
		
		try {
			userService.createUser(user2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User 2 created with ID : " + user2.getId());
		
		try {
			userService.createUser(user3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User 3 created with ID : " + user3.getId());

	}

}
