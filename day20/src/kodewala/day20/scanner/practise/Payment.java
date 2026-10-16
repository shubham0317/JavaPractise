package kodewala.day20.scanner.practise;

public interface Payment {
	
	void pay(double amount);
	
}

class UPIPayment implements Payment {
	

	
	public void pay(double amount) {
		System.out.println(amount + " Paid using UPI");
	}
	
}

class CreditCardPayment implements Payment {

	
	
	public void pay(double amount) {
		
		System.out.println(amount + " Paid using CrediCard");
	}
}


class CashPayment implements Payment {

	
	
	public void pay(double amount) {
		System.out.println(amount + " Paid using Cash");
	}
}


