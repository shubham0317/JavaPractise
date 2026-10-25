package day34.kodewala.practise;

public class DeliveryProcessor {

	
	public void processDelivery(DeliveryService service, double distance) {

        if (distance <= 0) {
            System.out.println("Invalid distance!");
            return;
        }

        double fee = service.calculateDeliveryFee(distance);
        int time = service.getEstimatedTime();
        System.out.println("\nDelivery Type: " + service.getDeliveryType());
        System.out.println("Distance: " + distance + " km");
        System.out.printf("Delivery Fee: ₹%.2f%n", fee);
        System.out.println("Estimated Time: " + time + " minutes");
    }
	
}
