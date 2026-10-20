package day32.kodewala.overriding1;

public class AccountDriver {

	public static void main(String[] args) {
		Account ac = new SavingAccount();
		ac.openAccount("Shubham", 50);
	}
	
}
