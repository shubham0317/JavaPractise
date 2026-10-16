package day19.kodewala.array.practice;

public class Product {
	
	
		private String productName;
		private int productId;
		private double price;
		private int quantity;
		private String category;
		
		
	

	public Product() {
		super();
	}




	public Product(String productName, int productId, double price, int quantity, String category) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public int getProductId() {
		return productId;
	}




	public void setProductId(int productId) {
		this.productId = productId;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}
	
	

	
}
