package com.kodewala.practise.exception;

public class PaymentMain {

	public static void main(String[] args) {
		
		PaymentService ps = new PaymentService();
		
		try {
		      ps.doPayment(1000);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch(PaymentFailedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
