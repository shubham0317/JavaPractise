class ArithmeticOperations
{

  public static void main(String [] args){
  
    int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
    int result = ArithmeticOperations.doAddition(num1, num2);
	
	System.out.println(" The sum of " + num1 + " and " + num2 + " is: " + result);
  
 }
  
  static int doAddition(int num1, int num2) 
  {
  
   int sum = num1 + num2;
   return sum;
  
  }

}