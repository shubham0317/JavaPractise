package day24.kodewala.string.practise;

public class LoginSystem {
   public static void main(String[] args) {
	   String savedUsername = "admin";

	   String enteredUsername = new String("admin");

	   if (savedUsername == enteredUsername) {
	       System.out.println("Login successful");
	   } else {
	       System.out.println("Login failed");
	   }
   }
}
