package day38.kodewala.interfacejava8;

public class FlighBooking implements IBooking {

	@Override
	public void booking() {
		System.out.println("FlighBooking.booking()......");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("FlighBooking.cancelBooking()......");
		
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
	
	void printTicket(String path,String contents) {
		IBooking.printTicket("", "");
	}

	
}
