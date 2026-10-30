package day39.kodewala.interfacetopic.notificationservice;

public class SMSNotificationService implements INotificationService{

	@Override
	public void sendNotification(String recipient, String message) {
		 System.out.println("Sending SMS to: " + recipient);
	        System.out.println("Message: " + message);
	}

}
