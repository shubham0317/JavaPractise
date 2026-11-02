package interfacepractise.Paymentgateway;

public class PaymentApp {

	public static void main(String [] args) {
		PaymentGateway.checkServiceStatus();
		
		PaymentGateway cc =  new CreditCardPayment();
		cc.validateTransaction();
		cc.processPayment(5000);
		
		PaymentGateway upi =  new UPIPayment();
		upi.validateTransaction();
		upi.processPayment(5000);
		
	}
}
