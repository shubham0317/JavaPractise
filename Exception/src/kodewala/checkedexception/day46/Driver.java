package kodewala.checkedexception.day46;

public class Driver {

	public static void main(String[] args) {

		/* Unchecked Exception: NullPointerException occurs at runtime when we access a method or property using a null reference. Handling it is not mandatory. */
		String name = null;
		System.out.println(name.length()); // Null pointerException --> unchecked exception

		/* Checked Exception: Checked exceptions are checked by the compiler at compile time. It is mandatory
		 *  to handle them using try-catch or declare them using the throws keyword. 
		 *  Examples: IOException, SQLException, ClassNotFoundException, and InterruptedException. */
		String className = "kodewala.checkedexception.day46";

		try {
			Class.forName(className);
			System.out.println(" class loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
