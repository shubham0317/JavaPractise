package day38.kodewala.interfacejava8;

public class TrainBooking implements IBooking{

	@Override
	public void booking() {
		System.out.println("TrainBooking.booking()....");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainBooking.cancelBooking()....");
		
	}

	@Override
	public Booking chekcStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void autoUpgrade() {
		System.out.println(" TrainBooking.autoUpgrade().....");
	}
	
	void printTicket(String path,String contents) {
		IBooking.printTicket("", "");
	}


}
