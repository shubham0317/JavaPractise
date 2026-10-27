package foodorderwebsite.initial;

import java.util.Objects;

public class OrderService {
	
	private final NotificationService notificationService;
	
	

	public OrderService(NotificationService notificationService) {
		this.notificationService = Objects.requireNonNull(
				notificationService,
	            "Notification service cannot be null"
	        );
	}



	public void orderPlaced() {
		
		System.out.println("Order placed successfully.");
		
		notificationService.sendNotification(
                "Your food order has been placed."
        );
	}
}
