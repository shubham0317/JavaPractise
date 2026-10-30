package day38.kodewala.interfacejava8;


/* Java 8 and above
 * Here we have learned interface of java 8 and above where java introduced
 * default method means which --> that doesn't  need to compulsory implement that method  
 */

public interface IBooking {

	public abstract void booking();
	public abstract void cancelBooking();
	public abstract Booking chekcStatus();
	SearchResult search();
	public default void autoUpgrade() {
		connectToDB();
		System.out.println("IBooking.autoUpgrade");
	}
	public static void printTicket(String path, String content) {
		System.out.println("Printing ticket ... Static method....");
	}
	
	private void connectToDB() {
		System.out.println("Connecting to DB");
	}
}
