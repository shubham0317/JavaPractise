package day39.kodewala.interfacetopic.notificationservice;

public class OrderService {

	private final INotificationService notificationService;

	public OrderService(INotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void placeOrder(String customerEmail) {

        System.out.println("Order placed successfully!");

        notificationService.sendNotification(
            customerEmail,
            "Your order has been confirmed."
        );
    }
	
	
}
