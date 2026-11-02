package day40.lambdafun.practise;

public class PayMain {

	public static void main(String []  args) {
		
		ProcessPayment processor = new ProcessPayment();
		
		Payment upi =  (amount) -> {
			 System.out.println(amount + " : Paid using UPI");
		};
		
		Payment cc =  (amount) -> {
			 System.out.println(amount + " : Paid using CC");
		};
		
		processor.processPay(upi, 1500);
        processor.processPay(cc, 2500);
		
	}
}
