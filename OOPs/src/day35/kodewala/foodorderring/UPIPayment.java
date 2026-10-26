package day35.kodewala.foodorderring;

public class UPIPayment implements Payment{
  
	@Override
	public void pay(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Payment amount must be greater than zero");
		}
		
		System.out.println(
	            "UPI payment successful: Rs. " + amount
	        );
	}
	
	
}
