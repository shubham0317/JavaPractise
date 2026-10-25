package day34.kodewala.polymorphism2;

public class DebitCardPayment extends Payment {

	@Override
	public void doPayment()
	   {
		   System.out.println("CreditCard.doPayment()....... Payment ");
	   }

}
