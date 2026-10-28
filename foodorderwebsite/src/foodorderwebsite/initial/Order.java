package foodorderwebsite.initial;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static int orderCounter = 0;
	private final int orderId;
	private List<OrderItem> orderItem;
	private OrderStatus status;
	
	
	
	public Order() {
		this.orderId = ++orderCounter;
		this.orderItem = new ArrayList<>();
		this.status = OrderStatus.PLACED;
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

    public void updateStatus(OrderStatus newStatus) {
    	 if (newStatus == null) {
             throw new IllegalArgumentException(
                 "Order status cannot be null"
             );
         }

         if (this.status == OrderStatus.DELIVERED) {
             throw new IllegalStateException(
                 "Delivered orders cannot change status"
             );
         }

         this.status = newStatus;

         System.out.println("Order status updated to: " + this.status);
    }
    public void displayOrderStatus() {
        System.out.println("Current Order Status: " + status);
    }
}
