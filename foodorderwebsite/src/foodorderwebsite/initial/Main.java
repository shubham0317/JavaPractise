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
		
		
	}
}
