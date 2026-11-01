package interfacepractise.Paymentgateway;

public interface PaymentGateway {

	default void validateTransaction() {
		log("Validating transaction");
		System.out.println("Transaction validate!");
	}
	
	static void checkServiceStatus() {
		log("Payment service is active.");
	}
	
	private static void log(String message) {
		System.out.println("[LOG] " + message);
	}
	
	void processPayment(double amount);
}
