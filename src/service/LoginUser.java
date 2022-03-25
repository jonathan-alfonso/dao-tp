package service;

public class LoginUser {

	public static void main(String[] args) {
		
		UserService userService = UserService.getInstance();

		System.out.println("Testing login with good pwd");
		try {
			userService.doLogin("jalfonso", "pwd4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.err.println("Testing login with wrong pwd");
		try {
			userService.doLogin("jalfonso", "wrong pwd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
