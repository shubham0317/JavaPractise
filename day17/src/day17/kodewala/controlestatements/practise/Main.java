package day17.kodewala.controlestatements.practise;

public class Main {
	
	public static void main(String[] args) {
      /*	
       * zepto discount feature	
		GroceryDiscount gd = new GroceryDiscount();
		  int discount  = gd.calculateDiscount(5000);
		  if(discount == -1) {
			  System.out.println(" Invalid Cart amount ");
		  } else if(discount == 0) {
			  System.out.println(" No discount applicable ");
		  } else {
			  System.out.println(" You are elegible for discount of: " + discount);
		  }
	   	*/  
	
	/*
	FoodOrder fd = new FoodOrder();
	  int discount  = fd.calculateDiscount(5000);
	  if(discount == -1) {
		  System.out.println(" Invalid Cart amount ");
	  } else if(discount == 0) {
		  System.out.println(" No discount applicable ");
	  } else {
		  System.out.println(" You are elegible for discount of: " + discount);
	  }
	
	*/
		
		Loan intrest = new Loan();
		  int processingFee  = intrest.calculateProcessingFee(3000000);
		  if(processingFee == -1) {
			  System.out.println("");
		  } else if(processingFee == 500) {
			  System.out.println(" 500 rupee will be charged ");
		  } else {
			  System.out.println(" You processing fee will be :" + processingFee);
		  }
		
	}	
}
