package com.kodewala.practise.exception;

public class Main {

 public static void main(String[] args){
	
	 
	try {
		ValidateAge.checkAge(19);
		UserService us = new UserService();
		us.log("Shubham");
	}
	catch (InvaliAgeException e ){
		System.out.println(e.getMessage());
	}catch (UserNotFoundException e) {
		System.out.println(e.getMessage());
	}
	
}
}
