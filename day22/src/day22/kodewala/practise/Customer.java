package day22.kodewala.practise;

public class Customer {

	 String name;
	    String address;

	    Customer(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }

	    void displayCustomer() {
	        System.out.println("Customer: " + name);
	        System.out.println("Address: " + address);
	    }
	
}
