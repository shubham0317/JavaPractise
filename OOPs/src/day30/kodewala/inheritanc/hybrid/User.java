package day30.kodewala.inheritanc.hybrid;

public class User {

	String userName;
	
	
	
	
	public User(String userName) {
		super();
		this.userName = userName;
	}




	public void showUser() {
		System.out.println("This is a user class of Zepto");
	}
}

class DeliverBoy extends User{
	
	String licenceNo ;
	
	
	
	public DeliverBoy(String userName, String licenceNo) {
		super(userName);
		this.licenceNo = licenceNo;
	}



	@Override
	public void showUser() {
		System.out.println("Here Delivery Boy is user for zepto");
	}
}

class Customer extends User {
    String custId ;
	
    
    
    public Customer(String userName, String custId) {
		super(userName);
		this.custId = custId;
	}



	@Override
	public void showUser() {
		System.out.println("Here Customer is a user for zepto");
	}

}
