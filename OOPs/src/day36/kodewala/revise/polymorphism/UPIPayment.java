package day36.kodewala.revise.polymorphism;


/*
 * Introduced UPI Feature
 */
public class UPIPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay().......UPIPayment");
	}
}
	