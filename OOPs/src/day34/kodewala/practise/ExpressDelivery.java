package day34.kodewala.practise;

public class ExpressDelivery extends DeliveryService{

	@Override
    public double calculateDeliveryFee(double distance) {
        return 40 + (12 * distance);
    }

    @Override
    public int getEstimatedTime() {
        return 20;	
    }

    @Override
    public String getDeliveryType() {
        return "Express";
    }
}
