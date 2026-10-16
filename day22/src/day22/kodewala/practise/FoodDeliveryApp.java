package day22.kodewala.practise;

import java.util.Scanner;

public class FoodDeliveryApp {

	 public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);

	     Food pizza = new Food("Pizza", 250);
	     Food burger = new Food("Burger", 150);
	     Food biryani = new Food("Biryani", 200);

	     Customer customer = new Customer("Shubham", "Bangalore");

	     Restaurant restaurant = new Restaurant("Food Palace");

	     System.out.println("===== FOOD MENU =====");
	     System.out.println("1. Pizza - ₹250");
	     System.out.println("2. Burger - ₹150");
	     System.out.println("3. Biryani - ₹200");

	     System.out.print("Enter your choice: ");
	     int choice = sc.nextInt();

	     Food selectedFood;

	     switch (choice) {
	         case 1:
	             selectedFood = pizza;
	             break;

	         case 2:
	             selectedFood = burger;
	             break;

	         case 3:
	             selectedFood = biryani;
	             break;

	         default:
	             System.out.println("Invalid choice!");
	             sc.close();
	             return;
	     }

	     Order order = new Order(selectedFood, customer, restaurant);

	     order.showOrder();

	     sc.close();
	 }
	}

