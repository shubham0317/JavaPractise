package day39.kodewala.interfacetopic.notificationservice;

public class EmailNotification implements INotificationService{

	@Override
	public void sendNotification(String recipient, String message) {
		System.out.println("Sending Email to: " + recipient);
        System.out.println("Message: " + message);
	}

}
