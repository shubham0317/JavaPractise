package kodewala.markerInterface.day42;

public class Driver {

	public static void main(String[] args) {
		
		User u = new User("Shubham", "User1");
		DataCleaner dc =  new DataCleaner();
		dc.clean(u);
		
	}
}
