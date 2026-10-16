class Driver
{

   public static void main(String[] args)
   {
    System.out.println(" Driver class Started");
	
	OrderMagmt objMgmt = new OrderMagmt();
	objMgmt.placeOrder(" Iphone 18 ");
	
	System.out.println(" Driver class Ended");
   }

}