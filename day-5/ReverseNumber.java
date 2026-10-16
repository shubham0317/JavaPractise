class ReverseNumber{

   public static void main(String[] args) {
    
	int number  = Integer.parseInt(args[0]);
	int reversedN = 0;
	while(number != 0) {
	 int num = number%10;
	 reversedN = reversedN * 10 + num;
	 number = number / 10;
	}
    System.out.println("ReverseNumber: " + reversedN);
   
   }

}