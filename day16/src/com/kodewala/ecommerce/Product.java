package com.kodewala.ecommerce;


/**
 * This is the parent class for all products
 */
public class Product {
	
	String name;
	int price;
	String productId;
	
	public Product(String _name, int _price, String _productId) {
		super();
		this.name = _name;
		this.price = _price;
		this.productId = _productId;
	}
	
	

}
