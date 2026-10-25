package day34.kodewala.practise;

public class ScheduledDelivery extends DeliveryService {

	@Override
    public double calculateDeliveryFee(double distance) {
        return 10 + (5 * distance);
    }

    @Override
    public int getEstimatedTime() {
        return 60;
    }

    @Override
    public String getDeliveryType() {
        return "Scheduled";
    }
}
