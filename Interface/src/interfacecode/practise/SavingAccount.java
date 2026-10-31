package interfacecode.practise;

public class SavingAccount implements BankAccount{
	private double balance;
	
	

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println(" Deposited " + amount + " in savings Accoun.New Balnce: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance - amount >= MIN_BALANCE) {
			balance -= amount;
		}
		System.out.println(" Withdrawn " + amount + " From savings Accoun.New Balnce: " + balance);
		
	}

	@Override
	public double checkBal() {
		return balance;
		
	}

}
