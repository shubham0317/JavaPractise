package day21.kodewala.practise;

abstract class Notification {

	abstract void send(String message);
	
}  

class EmailNotification extends Notification{
	
	void send(String message) {
		System.out.println(message);
	}
}

class SMSNotification extends Notification  {
	void send(String message) {
		System.out.println(message);
	}
}

class WhatsAppNotification extends Notification  {
	void send(String message) {
		System.out.println(message);
	}
}





