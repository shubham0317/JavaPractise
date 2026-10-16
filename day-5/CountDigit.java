class CountDigit{

   public static void main(String[] args) {
   
      int digit = Integer.parseInt(args[0]);
	  
	  int d = digit;
	  int count = 0;
	  while(digit != 0) {
	  count++;
	   int num = digit % 10;
	   digit = digit / 10;
	  }
	  System.out.println("Count of the Digit " + d +" is " + count);
   
   }

}