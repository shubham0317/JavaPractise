package day22.kodewala.switchcase;

public class DiscountFeature {

	
	double  goldDiscount= 20;
	double  silverDiscount = 10;
	double regularDicount = 5;
	
	public void applyDiscount(String custType, int amount) {
		switch(custType) {
		case "gold":
			calculateDiscount(goldDiscount, amount);
			break;
		
		case "silver":
			calculateDiscount(silverDiscount, amount);
			break;
		case "regular":
			calculateDiscount(regularDicount, amount);
		default:
			System.out.println(" You are not eligible for discount");
			break;
		}
	}
	
	public void  calculateDiscount(double percentage, int amount) {
		double appliedDiscount = (amount * percentage) / 100.0;
		System.out.println("You are eligible for " + percentage + " discount which is: " + appliedDiscount);
	}
	
}
