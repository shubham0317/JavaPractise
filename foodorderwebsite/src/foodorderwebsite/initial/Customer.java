package foodorderwebsite.initial;

public class Customer extends User{

	private String deliveryAddress;

	public Customer(String userId,String name, String email, String deliveryAddress) {
		super(userId,name,email);
		this.deliveryAddress = deliveryAddress;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();

        System.out.println("Delivery Address: "
                + deliveryAddress);
    
	}
	
	@Override
	public void showRole() {
		System.out.println("Customer");
	};
}
