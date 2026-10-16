class FindLargestNum{

   public static void main(String[] args) {
   
    if(args.length == 0) {
	 System.out.println("Warning please enter the numbers");
	 return;
	}
	
	int largest = Integer.parseInt(args[0]);
	
	for (int i = 0; i < args.length; i++) {
	  int num = Integer.parseInt(args[i]);
	  if(num > largest) {
	   largest = num;
	  }
	}
	System.out.println("The larget num is :" + largest);
   
   }

}