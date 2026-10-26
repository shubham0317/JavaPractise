package day35.kodewala.foodorderring;

public class FoodItem {

	private String itemName;
	private double price;
	private int quantity;
	public FoodItem(String itemName, double price, int quantity) {
		super();
		if (price < 0)  {
			 throw new IllegalArgumentException("Price cannot be negative");
		}
		
		if (quantity < 0)  {
			 throw new IllegalArgumentException("Quanity cannot be negative");
		}
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
    public double calulateTotalPrice() {
    	return price * quantity;
    }

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    
}
