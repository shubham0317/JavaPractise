package day36.kodewala.revise.polymorphism;


/*
 * Here we are taking any type of payment and completing the transaction
 */
public class ProcessPayment {

	public void processPayment(Payment payment) {
		payment.pay();
	}
}
