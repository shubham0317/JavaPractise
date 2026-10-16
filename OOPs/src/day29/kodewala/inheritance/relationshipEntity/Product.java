package day29.kodewala.inheritance.relationshipEntity;

public class Product {

	String productName;
	String description;
	int quantity;
	String status;
	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}
	
	public void showProductdetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
	}
	
}
