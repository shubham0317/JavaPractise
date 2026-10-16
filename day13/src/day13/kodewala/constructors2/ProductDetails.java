package day13.kodewala.constructors2;

public class ProductDetails {

	String productName;
	int price;
	String description;
	int quantity;
	
	ProductDetails(String _productName, int _price, String _description, int _quantity) {
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}

	ProductDetails(String _productName, String _description) {
		this.productName = _productName;
		this.description = _description;
	}

	ProductDetails() {
		
	}
	
	
}
