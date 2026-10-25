package day34.kodewala.polymorphism2;

public class CreditCard extends Payment{

	@Override
	public void doPayment()
	   {
		   System.out.println("CreditCard.doPayment()....... Payment ");
	   }
	
}
