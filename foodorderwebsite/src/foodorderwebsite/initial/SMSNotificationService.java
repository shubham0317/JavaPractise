package foodorderwebsite.initial;

public class SMSNotificationService implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println("Message sent using SMS: " + message);
	}
}
