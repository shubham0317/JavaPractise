package day19.kodewala.array.practice;

public class Order {

	private String customerName;
	private String orderId;
	private String foodItem;
	private double amount;
	private String status;
	
	public Order() {
		
	}
	
	public Order(String customerName, String orderId, String foodItem, double amount, String status) {
		super();
		this.customerName = customerName;
		this.orderId = orderId;
		this.foodItem = foodItem;
		this.amount = amount;
		this.status = status;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void displayStatus() {
		System.out.println(" Order " + orderId + " by " + customerName + " is " + status);
	} 
	
	
}
