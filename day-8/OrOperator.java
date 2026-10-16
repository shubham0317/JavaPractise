class OrOperator {

   public static void main(String[] args) {
   
     int input = Integer.parseInt(args[0]);
	  
	 System.out.println(" Condition1: " + (input > 1));
	 System.out.println(" Condition1: " + (input > 2000));
	 
	 System.out.println(" Cheking Validity " + ((input > 1) || (input < 2000)));
   
   }

}