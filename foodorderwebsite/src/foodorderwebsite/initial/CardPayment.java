package foodorderwebsite.initial;

public class CardPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
	  System.out.println("Payment of " + amount + " completed using Card.");
	}
}
