package day21.kodewala.practise;

abstract class FoodDelivery {
  abstract void calculateDeliveryCharge(double distance);
  abstract void deliverFood();
}


class SwiggyDelivery extends FoodDelivery{
	
	int deliveryCharge = 3;
	
	void calculateDeliveryCharge(double distance) {
		System.out.println("Delivery charge for distance " + distance + " is" + distance * deliveryCharge);
	}
	
	void deliverFood() {
		System.out.println("In 20 minutues food will be deliverd");
	}
	
}

class ZomatoDelivery extends FoodDelivery {
int deliveryCharge = 4;
	
	void calculateDeliveryCharge(double distance) {
		System.out.println("Delivery charge for distance " + distance + " is" + distance * deliveryCharge);
	}
	
	void deliverFood() {
		System.out.println("In 30 minutues food will be deliverd");
	}
}

class RestaurantSelfDelivery extends FoodDelivery {
int deliveryCharge = 5;
	
	void calculateDeliveryCharge(double distance) {
		System.out.println("Delivery charge for distance " + distance + " is" + distance * deliveryCharge);
	}
	
	void deliverFood() {
		System.out.println("In 40 minutues food will be deliverd");
	}
}





