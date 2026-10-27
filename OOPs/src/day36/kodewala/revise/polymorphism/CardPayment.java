package day36.kodewala.revise.polymorphism;


/*
 * This is a card payment feature 
 */
public class CardPayment extends Payment{

	@Override
	public void pay() {
		System.out.println("CardPayment.pay().......CardPayment");
	}
}
