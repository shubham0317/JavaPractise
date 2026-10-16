class DataType {


  static short num;
  
  //default value is false;
    static boolean isPresent;  
   public static void main(String[] args) {
   
      byte amount = 120;
	  System.out.println("The amount is : " + amount);
	  
	 //Rage of byte is -128 to 127 -> if we will try to keep value from out of the range it will give error of incompatible types
	 // byte am1 = 200;
	  //System.out.println(am1);
	  
	  //Short
	  short amount1 = 200;
	  System.out.println("The amount is : " + amount1);
	  
	  //short num; 
	  /* default value for integer type is 0 and 
	  if we initalize without any value inside the class
	  it will give error and if you decleare outside the class
	 it will not give any error*/
	  System.out.println("The amount is : " + num);
	  System.out.println("Check the status: " + isPresent );
   
   }

}