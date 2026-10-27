package foodorderwebsite.initial;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static int orderCounter = 0;
	private final int orderId;
	private List<OrderItem> orderItem;
	
	
	
	public Order() {
		this.orderId = ++orderCounter;
		this.orderItem = new ArrayList<>();
	}
	
	public void displayOrderId() {
        System.out.println(orderId);
    }

    public static int getTotalOrders() {
        return orderCounter;
    }
    
    public void addItem(OrderItem item) {
    	
    	if (item == null) {
    		throw new IllegalArgumentException(" Item can't be null");
    	}
    	orderItem.add(item);
    }
    
    public void displayOrder() {
    	for (OrderItem o: orderItem) {
    		o.displayOrderItem();
    	}
    	calculateTotal();
    }
    
    private void calculateTotal() {
    	double grandTotal = 0;
    	for (OrderItem o: orderItem) {
    		grandTotal += o.getSubTotal();
    	}
    	System.out.println(grandTotal);
    }
	
}
