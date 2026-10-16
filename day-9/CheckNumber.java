class CheckNumber {
    
	public static void main(String[] args) {
	 
	  boolean result =  isEven(Integer.parseInt(args[0]));
	  if(result == true) {
	  System.out.println(" Number is even ");
	  } else {
	  System.out.println(" its not a even number ");
	  }
	
	}
	
	static boolean isEven(int num) {
	  return num % 2 == 0;
	}
	
	
}