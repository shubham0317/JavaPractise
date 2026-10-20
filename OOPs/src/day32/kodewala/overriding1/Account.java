package day32.kodewala.overriding1;

public class Account {

	public String openAccount(String name, int initiBal) {
		System.out.println("Account.openAccount()......");
		return "Some String";
	}
}

class SavingAccount extends Account 
{
	@Override
	public String openAccount(String name, int initiBal) {
		System.out.println("SavingAccount.openAccount()......");
		return "Some other String";
	}
}
