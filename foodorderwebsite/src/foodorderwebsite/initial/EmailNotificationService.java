package foodorderwebsite.initial;

public class EmailNotificationService  implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println("Message sent using Email: " + message);
	}
}
