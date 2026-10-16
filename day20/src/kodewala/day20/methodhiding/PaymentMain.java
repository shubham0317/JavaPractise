package kodewala.day20.methodhiding;

public class PaymentMain {

	public static void main(String[] args) {
		Payment p = new UPIPayment();
		p.pay();
	}
	
	
	
}
