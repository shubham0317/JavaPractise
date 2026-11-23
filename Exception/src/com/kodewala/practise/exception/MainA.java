package com.kodewala.practise.exception;

public class MainA {

	public static void main(String[] args) {
		
		A obj = new A();
		try {
			obj.MethodA();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
