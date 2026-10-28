package foodorderwebsite.initial;

public class Main {

     public static void main(String[] args) {
    	 
    	 
    	 /*
    	  * Restaurant btmCafe = new Restaurant("R101", "BTM Cafe");
    	
    	Restaurant kodewalaCafe = new Restaurant("R102", "Kodewala Cafe");
		
		FoodItem burger = new FoodItem("101", "Burger", "FastFood", 120);
		
		
		FoodItem pizza = new FoodItem("102", "Pizza", "Italian", 250);
		
		pizza.setPrice(70);
		kodewalaCafe.addFoodItem(pizza);
		kodewalaCafe.displayMenu();
		btmCafe.addFoodItem(burger);
		btmCafe.addFoodItem(pizza);
		btmCafe.displayMenu();
    	  */
    	
    	 
		
		
		User customer = new Customer(
			    "U101",
			    "Shubham",
			    "shubham@example.com",
			    "Bengaluru"
			);

		User admin = new Admin(
			    "U201",
			    "Rahul",
			    "rahul@example.com",
			    "Super Admin"
			);

			customer.displayDetails();
			System.out.println("---------------");
			admin.displayDetails();
			
			customer.showRole();
			admin.showRole();
			
			NotificationService nscc = new SMSNotificationService();
			
			OrderService orderService =  new OrderService(nscc);
			orderService.orderPlaced();
		
			OrderService pushOrder =
			        new OrderService(new PushNotificationService());

			pushOrder.orderPlaced();
			
			
			PaymentService upiService =
			        new PaymentService(new UPIPayment());

			PaymentService cardService =
			        new PaymentService(new CardPayment());

			upiService.processPayment(500);
			System.out.println("--------------");
			cardService.processPayment(1000);
			
			
			Order order1 = new Order();
			Order order2 = new Order();
			Order order3 = new Order();

			order1.displayOrderId();
			order2.displayOrderId();
			order3.displayOrderId();

			System.out.println("Total orders: " + Order.getTotalOrders());
			
			
			 Order order = new Order();

		        order.displayOrderId();
		        order.displayOrderStatus();

		        order.updateStatus(OrderStatus.CONFIRMED);
		        order.updateStatus(OrderStatus.PREPARING);
		        order.updateStatus(OrderStatus.OUT_FOR_DELIVERY);
		        order.updateStatus(OrderStatus.DELIVERED);

		        order.displayOrderStatus();
		
	}
     
     
}
