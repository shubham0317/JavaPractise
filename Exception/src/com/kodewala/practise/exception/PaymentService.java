package com.kodewala.practise.exception;

public class PaymentService {

	public void doPayment(int amount) {
		
	
	if(amount <= 0) {
		throw new IllegalArgumentException(
				"Invalid Payment Amount");
	}
	boolean paymentSuccessful = false;
	
	if(!paymentSuccessful) {
		throw new PaymentFailedException("Payment Transaction Failed");
	}
	
	System.out.println(" Payment Successful");
	
	}
	
	
}
