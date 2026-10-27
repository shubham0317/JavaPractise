package foodorderwebsite.initial;

import java.util.Objects;

public class OrderItem {

	private FoodItem foodItem;
	private int quantity;
	
	public OrderItem(FoodItem foodItem, int quantity) {
		if(quantity <= 0 ) {
			throw new IllegalArgumentException(" Atleast 1 quantity needed");
		}
		this.foodItem = Objects.requireNonNull(
	            foodItem, "Food item cannot be null"
	        );
		this.quantity = quantity;
	}
	
	public double getSubTotal() {
		return foodItem.getPrice() * quantity;
 	}
	
	public void displayOrderItem() {
		System.out.println("Food Name: " + foodItem.getName());
		System.out.println("Food Quantity: " + quantity);
		System.out.println("Food Subtotal: " + getSubTotal());
	}
	
}
