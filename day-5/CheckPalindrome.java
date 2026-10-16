class CheckPalindrome{

   public static void main(String[] args) {
   int number  = Integer.parseInt(args[0]);
   int original = number;
	int reversedN = 0;
	while(number != 0) {
	 int num = number%10;
	 reversedN = reversedN * 10 + num;
	 number = number / 10;
	}
	
	if(original ==  reversedN) {
	System.out.println("Its a palindorme Number");
	} else {
	System.out.println("Its not a palindorme Number");
	}
    
   }

}