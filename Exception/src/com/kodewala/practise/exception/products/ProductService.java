package com.kodewala.practise.exception.products;

public class ProductService {

	public void purchaseProduct(int quantity, int stock) {
		
		if(quantity > stock) {
			throw new OutOfStockException("Product is out of stock");
		}
		
		System.out.println(" Order placed Sucessfully");
	}
	
	
}
