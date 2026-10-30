package day39.kodewala.interfacetopic.notificationservice;

public class Main {

	public static void main(String [] args) {
		INotificationService ems = new EmailNotification();
		
		OrderService orderService =  new OrderService(ems);
		orderService.placeOrder("customer@gmail.com");
	}
}
