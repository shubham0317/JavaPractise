package day21.kodewala.practise;

public class AccountMain {

	public static void main(String[] args) {
		Account saving  =  new SavingsAccount(5000);
		saving.showBalance();
		saving.calculateIntrest();
		saving.showBalance();
		
		Account current =  new CurrentAccount(50000);
		current.showBalance();
		current.calculateIntrest();
		current.showBalance();
	}
	
}
