
package foodorderwebsite.initial;

public class FoodItem {

	
	private String id;
	private String name;
	private String category;
	private double price;
	
	
	public FoodItem(String id, String name, String category, double price) {
		super();
		if (price <= 0) {
			throw new IllegalArgumentException(
	                "Price must be greater than zero"
	            );
		}
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public  void displayDetails() {
		System.out.println("Food Id: " + id);
		System.out.println("Food Name: " + name);
		System.out.println("Food Category: " + category);
		System.out.println("Food Price: " + price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException(
	                "Price must be greater than zero"
	            );
		}
		this.price = price;
	}
	
	
	
}
