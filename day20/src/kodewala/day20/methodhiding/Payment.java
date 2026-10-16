package kodewala.day20.methodhiding;

public class Payment {

	static void pay() {
		System.out.println("Payment");	
	}
	
}

class UPIPayment extends Payment {
	static void pay() {
		System.out.println("Payment");	
	}
}
