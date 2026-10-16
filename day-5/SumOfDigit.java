class SumOfDigit {

  public static void main(String[] args) {
  
    int digit = Integer.parseInt(args[0]);
	
	int sum = 0;
	
	while(digit != 0) {
	
	 int num = digit % 10;
	 sum += num;
	 digit = digit / 10;
	
	}
	System.out.println("Sum of the digit is: " + sum);
  
  }

}