package day21.kodewala.practise;

public class NotificationMain {

	public static void main(String [] args) {
		
		Notification nf1 = new EmailNotification();
		nf1.send("Notification from Email");
		System.out.println("________________________________");
		
		Notification nf2 = new SMSNotification();
		nf2.send("Notification from sms");
		System.out.println("________________________________");
		
		Notification nf3 = new WhatsAppNotification();
		nf3.send("Notification from whatsapp");
		
	}
	
}
