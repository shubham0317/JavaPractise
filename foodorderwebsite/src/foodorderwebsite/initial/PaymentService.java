package foodorderwebsite.initial;

import java.util.Objects;

public class PaymentService {

	private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
    	this.paymentMethod = Objects.requireNonNull(
    			paymentMethod,
	            "Payment service cannot be null"
	        );
    }

    public void processPayment(double amount) {
    System.out.println("Payment completed successfully.");
		
    paymentMethod.pay(amount);
    }
}
