class Payment {


    int tax = 25;  //belongs to the object
	static int gst = 15; //  belongs to the class


   public static void main(String[] args) {
   
      // created variables
	  int balance;  //Defining the variable
	  balance = 200; //Initializing  the variable
	  int amountToBeTxn = 10;
	  
	  System.out.println(" Balnce is: " + balance);
	  System.out.println(" Transaction amout is: " + amountToBeTxn);
	  printAmount();
   
   }
   
   static void printAmount() {
	   /* It will give error error: cannot find symbol
	   because balance is local variable it is inside the main method
	   and we are trying to access the local variable outside the method*/
	   System.out.println("Tax is: " + tax);
   }
   //Local variable --> Belongs from method and it can be usable inside the method otherwise it will give error
   //Instance variable --> variable decleared outside the method but inside the class
}