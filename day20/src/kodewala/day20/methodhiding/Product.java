package kodewala.day20.methodhiding;

public class Product {

	String name;
	double price;
	
	void applyDisount() {
		System.out.println("Discount applicable");
	}
	
}

class ElectronicsProduct extends Product {
	
	void applyDisount() {
		System.out.println("5% Discount applicable on electronics product");
	}
	
}


class ClothingProduct extends Product {
	
	void applyDisount() {
		System.out.println("10% Discount applicable on clothing product");
	}
	
}

