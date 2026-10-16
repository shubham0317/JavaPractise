package day21.kodewala.practise;

public class FDMain {

	public static void main(String[] args) {
		
		System.out.println(" Ordered Using Swiggy");
		FoodDelivery fd1 = new SwiggyDelivery();
		fd1.calculateDeliveryCharge(5);
		fd1.deliverFood();
		System.out.println("________________________________");
		
		System.out.println(" Ordered Using Zomato");
		FoodDelivery fd2 = new ZomatoDelivery();
		fd2.calculateDeliveryCharge(5);
		fd2.deliverFood();
		System.out.println("________________________________");
		
		
		System.out.println(" Ordered Using Resturant itself");
		FoodDelivery fd3 = new RestaurantSelfDelivery();
		fd3.calculateDeliveryCharge(5);
		fd3.deliverFood();
	}
	
	
	
	
}
