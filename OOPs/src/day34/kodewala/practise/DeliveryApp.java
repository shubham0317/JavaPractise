package day34.kodewala.practise;

public class DeliveryApp {

	
	public static void main(String[] args) {

        DeliveryProcessor processor = new DeliveryProcessor();

        DeliveryService standard = new StandardDelivery();
        DeliveryService express = new ExpressDelivery();
        DeliveryService scheduled = new ScheduledDelivery();

        double distance = 5;

        System.out.println("===== ZOMATO DELIVERY =====");

        processor.processDelivery(standard, distance);
        processor.processDelivery(express, distance);
        processor.processDelivery(scheduled, distance);
    }
}
