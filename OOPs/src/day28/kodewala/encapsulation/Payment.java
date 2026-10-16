package day28.kodewala.encapsulation;

public class Payment {
 
	private int balance;
	
	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	
	public void doDebit(int amount) {
		balance -= amount;
	}
	
	public void doCredit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
}
