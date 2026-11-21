package kodewala.exception.day46.practise;

public class ExceptionExample {

	public static void main(String[] aegs) {
		try {
			String user = "Kodewala";
			if(user.equals("Kodewala")) 
			{
				throw new UserAlreadyExists("User already exists");
			}
		} catch (UserAlreadyExists e) {
			System.out.println(e.getMessage());
		}
	}
}
