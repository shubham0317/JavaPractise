package day36.kodewala.revise.polymorphism;


/*
 * Added new feature of PayPalPayment in payment system
 */
class PayPalPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("PayPalPayment.pay().......PayPalPayment");
	}
}
