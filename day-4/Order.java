class Order {

    public static void main(String [] args) {
	   String orderId = args[0];
	   String productName = args[1];
	   String userName = args[2];
	   String deliveryAddress = args[3];
	   
	   System.out.println("Order id is: " + orderId);
	   System.out.println("Product name is: " + productName);
	   System.out.println("Placed by: " + userName);
	   System.out.println("Delivery Address: " + deliveryAddress);
	}
	

}