package kodewala.day20.scanner.practise;

public class PaymentMain {

	
	public static void main(String[] args) {
		
		Payment p1 = new UPIPayment();
		p1.pay(500);
		
		Payment p2 = new CreditCardPayment();
		p2.pay(1000);
		
		Payment p3 = new CashPayment();
		p3.pay(100);
		
	}
	
}
