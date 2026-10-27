package foodorderwebsite.initial;

public class OrderCalculator {

	public double calculateTotal(double price) {
		return price;
	}
	
	public double calculateTotal(double price, int quantity) {
		return price * quantity;
	}
	
	public double calculateTotal(double price, int quantity, double discount) {
		double discountedPrice = (price * quantity) - discount;
		return discountedPrice;
	}
}
