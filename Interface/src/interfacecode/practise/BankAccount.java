package interfacecode.practise;

public interface BankAccount {

	public static final double MIN_BALANCE = 1000;
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double checkBal();
	
}
