package com.kodewala.ecommerce;


/**
 * This is the class for creating electronic product
 */
public class ElectronicProduct extends Product {
	
	int warrenty;
	String type;

	public ElectronicProduct(String _name, int _price, String _productId, int _warrenty, String _type) {
		super(_name,_price, _productId);
		this.warrenty = _warrenty;
		this.type = _type;
	}
	
	void showProduct() {
		System.out.println(" This is a " + name + " with price of " + price + " and the warrenty for product is " + warrenty + " years.");
	}
	
	
}
