package day38.kodewala.interfacejava8;

public class BusBooking implements IBooking{

	@Override
	public void booking() {
		System.out.println("Busbooking.booking().....");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("Busbooking.cancelBooking().....");
		
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

}
