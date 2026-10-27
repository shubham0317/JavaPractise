package foodorderwebsite.initial;

public class UPIPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
	  System.out.println("Payment of " + amount + " completed using UPI.");
	}
}
