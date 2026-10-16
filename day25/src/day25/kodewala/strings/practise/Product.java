package day25.kodewala.strings.practise;

public class Product {
    
	String productName;
	double price;
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	 void displayDetails() {
	        System.out.println(productName + " : ₹" + price);
	 }
	
}
