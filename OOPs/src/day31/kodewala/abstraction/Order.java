package day31.kodewala.abstraction;

public class Order {

	public boolean placeOrder(String userName, String itemName, int quantity) {
		
		dbConnection();
		checkuserLogin(userName);
		checkItemStock(itemName);
		doPayment(itemName, quantity);
		generateOrderRecipt();
		return true;
	}
	
	private String  checkuserLogin(String userName) {
		return "User is loggedin";
	}
	
	private String dbConnection() {
		return "Db connection successful";
	}
	
	
	
	private boolean checkItemStock(String itemName) {
		return true;
	}
	
	private String doPayment(String itemName, int quantity) {
		return "Payment Successful";
	}
	
	private String generateOrderRecipt() {
		return "Total Bill == price * quantity";
	}
	
	
}
