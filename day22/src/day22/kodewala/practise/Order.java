package day22.kodewala.practise;

public class Order {

	
	Food food;
    Customer customer;
    Restaurant restaurant;

    Order(Food food, Customer customer, Restaurant restaurant) {
        this.food = food;
        this.customer = customer;
        this.restaurant = restaurant;
    }

    void showOrder() {
        System.out.println("\n----- ORDER DETAILS -----");
        customer.displayCustomer();
        restaurant.displayRestaurant();
        food.displayFood();
        System.out.println("Order confirmed!");
    }
}
