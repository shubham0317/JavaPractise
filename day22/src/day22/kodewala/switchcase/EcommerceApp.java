package day22.kodewala.switchcase;

import java.util.Scanner;

public class EcommerceApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String custType= args[0];
		int amount = Integer.parseInt(args[1]);
		
		
		DiscountFeature cust1 = new DiscountFeature();
		cust1.applyDiscount(custType, amount);
		
	}

}
