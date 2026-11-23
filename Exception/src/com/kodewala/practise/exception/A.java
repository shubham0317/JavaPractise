package com.kodewala.practise.exception;

public class A {

	
	void MethodA() {
		methodB();
	}
	
	void methodB() {
		methodC();
	}
	
	void methodC() {
		throw new RuntimeException("Something Went Wrong");
	}
}
