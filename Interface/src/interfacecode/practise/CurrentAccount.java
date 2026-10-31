package interfacecode.practise;

public class CurrentAccount implements BankAccount{
	
	private double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println(" Deposited " + amount + " in savings Accoun.New Balnce: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		
			balance -= amount;
		System.out.println(" Withdrawn " + amount + " From savings Accoun.New Balnce: " + balance);
		
	}

	@Override
	public double checkBal() {
		return balance;
	}

}
