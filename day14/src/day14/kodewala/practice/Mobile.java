package day14.kodewala.practice;

public class Mobile {
	
	String brand;
	double price;
	int ram;
	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public Mobile(String brand) {
		super();
		this.brand = brand;
	}
	public Mobile() {
		super();
		
	}
	
     void display() {
    	 System.out.println(
    			"Brand: " + brand +
    			"Price: " + price + 
    			"Ram: " + ram
    			 );
     }
	
}
