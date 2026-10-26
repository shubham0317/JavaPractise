package day35.kodewala.foodorderring;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("101", "Rahul", "9876543210");
		
		
		FoodItem burger = new FoodItem("Burger", 120.0, 2);
        FoodItem pizza = new FoodItem("Pizza", 300.0, 1);
        FoodItem coffee = new FoodItem("Cold Coffee", 80.0, 2);
        
        Payment payment =  new UPIPayment();
        
        FoodOrder order =  new FoodOrder("101", customer, payment);
        
        order.addFoodItem(burger);
        order.addFoodItem(pizza);
        order.addFoodItem(coffee);
        order.displayOrderSummary();
        order.processPayment();
        
        Payment cardPayment = new CardPayment();

        FoodOrder secondOrder = new FoodOrder(
            "1002",
            customer,
            cardPayment
        );

        secondOrder.addFoodItem(
            new FoodItem("Sandwich", 150.0, 2)
        );

        secondOrder.displayOrderSummary();
        secondOrder.processPayment();
	}
}
