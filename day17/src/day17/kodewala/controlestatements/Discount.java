package day17.kodewala.controlestatements;



public class Discount {
	
	

	public int checkDiscount(int fare) {
		  int discount = 0;

		    if (fare <= 0) {

		        System.out.println("Your fare should be more than 0");

		    } 
		    else if (fare < 5000) {

		        System.out.println("No discount applicable");

		    } 
		    else if (fare <= 10000 && fare >= 5000) {

		        discount = fare * 10 / 100;

		        if (discount > 1250) {
		            discount = 1250;
		        }

		    } 
		    else if (fare > 10000) {

		        discount = fare * 15 / 100;

		        if (discount > 1250) {
		            discount = 1250;
		        }
		    }

		    return discount;
	}
	
	
	
}
