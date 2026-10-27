package day36.kodewala.revise.polymorphism;

public class PaymentMain {

	public static void main(String[] args) {
		ProcessPayment pp =  new ProcessPayment();
		
		
		
		pp.processPayment(new UPIPayment());
		pp.processPayment(new CardPayment());
		
		
		/*
		 * Doing transaction using new payment method paypalpayment
		 */
		pp.processPayment(new PayPalPayment());
	}
}
