package day25.kodewala.strings.practise;

abstract class Food {
        String foodName;
        double price;
        abstract void displayProduct();
		public Food(String foodName, double price) {
			super();
			this.foodName = foodName;
			this.price = price;
		};
        
        
}

class Pizaa extends Food {
	
	
	Pizaa (String foodName,    double price){
		super(foodName,price);
	}
	
	void displayProduct() {
		System.out.println(foodName + ": " + price);
	}
	 
}

class Burger extends Food {
	
	
	Burger (String foodName,   double price){
		super(foodName,price);
	}
	
	void displayProduct() {
		System.out.println(foodName + ": " +price);
	}
	 
}
