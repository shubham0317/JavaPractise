package day35.kodewala.foodorderring;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder {

	private String orderId;
	private Customer customer;
	private List <FoodItem> foodItem ;
	private Payment payment;
	public FoodOrder(String orderId, Customer customer,	 Payment payment) {
		
		if (customer == null) {
			throw new IllegalArgumentException(" Customer can not be null");
		}
		
		if (payment == null) {
			throw new IllegalArgumentException(" Payment method can not be null");
		}
		
		
		this.orderId = orderId;
		this.customer = customer;
		this.payment = payment;
		this.foodItem = new ArrayList<>();
	}
	
	public void addFoodItem(FoodItem item) {
		if(item == null) {
			if (payment == null) {
				throw new IllegalArgumentException(" Food item cannot be null ");
			}
		}
		
		foodItem.add(item);
	}
	
	public double calculatePrice() {
		double total  = 0;
		
		for (FoodItem f : foodItem) {
			total += f.calulateTotalPrice();
		}
		return total;
	}
	
	public void displayOrderSummary() {

        System.out.println("\n===== FOOD ORDER SUMMARY =====");
        System.out.println("Order ID: " + orderId);

        customer.displayCustomerDetails();

        System.out.println("\nItems:");

        for (FoodItem item : foodItem) {
            System.out.println(
                item.getItemName()
                + " x "
                + item.getQuantity()
                + " = Rs. "
                + item.calulateTotalPrice()
            );
        }

        System.out.println(
            "\nTotal Amount: Rs. " + calculatePrice()
        );
    }
	
	public void processPayment() {

        if (foodItem.isEmpty()) {
            throw new IllegalStateException(
                "Cannot process payment for an empty order"
            );
        }

        double total = calculatePrice();

        payment.pay(total);
    }
	
	
	
	
}
