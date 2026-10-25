package day34.kodewala.practise;

public class StandardDelivery extends DeliveryService{

	
	  @Override
	    public double calculateDeliveryFee(double distance) {
	        return 20 + (8 * distance);
	    }

	    @Override
	    public int getEstimatedTime() {
	        return 40;
	    }

	    @Override
	    public String getDeliveryType() {
	        return "Standard";
	    }
	    
	    
}
