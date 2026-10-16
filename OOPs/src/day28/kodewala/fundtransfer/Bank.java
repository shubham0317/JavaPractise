package day28.kodewala.fundtransfer;

public class Bank {
  
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	
	
	public Bank(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void doCredit(double amount) {
		if (amount < 0) {
			
			return ;
		};
		
		balance += amount;
		
	}
	
	public void doDebit(double amount) {
		if (amount < 0) {
			
			return ;
		};
		
		if(amount > balance) {
			
			return;
		}
		
		balance += amount;
	}
	
	public double checkBalance() {
		return balance;
	}
	
	
}
