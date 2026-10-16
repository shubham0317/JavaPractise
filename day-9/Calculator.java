class Calculator {

   public static void main(String [] args) {
   
   int num1 = Integer.parseInt(args[0]);
   int num2 = Integer.parseInt(args[1]);
   String operation = args[2];
   
   int result ;
   
   if(operation.equals("+")){
   result = doAddition(num1, num2);
   } else if(operation.equals("-")){
   result = doSubstraction(num1, num2);
   } else if(operation.equals("*") || operation.equalsIgnoreCase("x")){
   result = doMultiplication(num1, num2);
   } else if(operation.equals("/")){
   result = doDivision(num1, num2);
   }else {
    System.out.println(" Please Enter the valid mathematic operation");
	return;
   }
   System.out.println("Result of operation is " + result);
   
   }
   
   static int doAddition(int a, int b){
    return a + b;
   }
   static int doSubstraction(int a, int b){
    return a - b;
   }
   static int doMultiplication(int a, int b ){
    return a * b;
   }
   static int doDivision(int a, int b){
    return a / b;
   }

}