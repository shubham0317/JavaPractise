package com.kodewala.practise.exception;

public class ValidateAge {

	static void checkAge(int age) throws InvaliAgeException {
		
		if (age < 18) {
			throw new InvaliAgeException(" Your age is less than 18");
		}
		
		
		System.out.println(" Your age is more than 18");
		
	}
}
