package service;

import model.User;

public class CreateUser {

	public static void main(String[] args) {

		UserService userService = UserService.getInstance();
		
		User user4 = new User();
		user4.setFirstname("Jonathan");
		user4.setLastname("Alfonso");
		user4.setLogin("jalfonso");
		user4.setPwd("pwd4");
		
		try {
			userService.createUser(user4);
			System.out.println("User 4 created with ID : " + user4.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
