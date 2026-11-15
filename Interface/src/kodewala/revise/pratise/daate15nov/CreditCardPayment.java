package kodewala.revise.pratise.daate15nov;

public class CreditCardPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println(amount + " paid using CreditCard");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("refund sucessful of " + amount);
		
	}
}
