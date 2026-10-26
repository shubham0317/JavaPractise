package day35.kodewala.foodorderring;

public class Customer {

	private String customerID;
	private String name;
	private String phoneNo;
	public Customer(String customerID, String name, String phoneNo) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public void displayCustomerDetails() {
		System.out.println(" Customer ID: " + customerID);
		System.out.println(" Customer Name: " + name);
		System.out.println(" Customer phone No: " + phoneNo);
	}
}
