class OrderMagmt
{

  private static int orderValue = 1200;
  public void placeOrder(String itemName) 
  {
    OrderMagmt objMgmt = new OrderMagmt();
	//using private variable with in the same class
	System.out.println(" Order value is: " + objMgmt.orderValue);
	System.out.println(" Placing an order for: " + itemName);
  }

}