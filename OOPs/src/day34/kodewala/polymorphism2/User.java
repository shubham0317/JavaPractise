package day34.kodewala.polymorphism2;

public class User {

	public static void main(String args[]) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		CreditCard cc = new CreditCard();
		paymentProcessor.processPayment(cc);
		
		NetBankingPayment netPayment = new NetBankingPayment();

		paymentProcessor.processPayment(netPayment);
		
		UpiPayment upiPayment = new UpiPayment();

		paymentProcessor.processPayment(upiPayment);
	}
}
