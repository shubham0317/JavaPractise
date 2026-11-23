package com.kodewala.practise.exception;
public class UserService {

	public void log(String userName) {
		
		if(!userName.equals("Shubham")) {
			throw new UserNotFoundException(""
					+ "User does Not Exists " + userName);
		} else {
			System.out.println("Login Sucessfull");
		}
		
	}
}
