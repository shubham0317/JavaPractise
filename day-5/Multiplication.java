class Multiplication{

  public static void main(String [] nums) {
  
  
      if(nums.length <= 2) {
	   System.out.println("Warning: Please pass the arguments");
	   return;
	  } 
	 
	 System.out.println("Result = " + (Integer.parseInt(nums[0]) * Integer.parseInt(nums[1])));
  
  }

}