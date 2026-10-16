package day13.kodewala.constructors2;

public class Account {

	 int amount;
	 String name;
	 
	 Account() {
		 System.out.println(" Inside Account()");
	 }
	 
	 Account(int amount, String name) {
		 System.out.println(" Account(int amount, String name) ");
		 this.amount = amount;
		 this.name = name;
	 }
	 
	 Account(String name, int amount) {
		 System.out.println("  Account(String name, int amount)");
		 this.amount = amount;
		 this.name = name;
	 }
	
	
}
