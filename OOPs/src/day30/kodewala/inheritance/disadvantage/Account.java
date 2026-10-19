package day30.kodewala.inheritance.disadvantage;


/*
 * Disadvantage of Inheritance 
 * Tight Coupling
 * Heavy Loading --> for loading child we need to initialize the entire hierarchy
 */
public class Account {

	public void openAccount(String userId, String email) {
		System.out.println(" Account.openAcccount() ");
	}
}

class SavingAccount extends Account {
	public void openAccount(String userId, String email) {
		System.out.println(" SavingAccount.openAcccount() ");
	}
}

class SrCitezen extends  SavingAccount {
	public void openAccount(String userId, String email) {
		System.out.println("SrCitezen.openAcccount() ");
	}
}

class PensionAccount extends SavingAccount {
	public void openAccount(String userId, String email) {
		System.out.println("PensionAccount.openAcccount() ");
	}
}
