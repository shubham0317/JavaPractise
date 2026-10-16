package day21.kodewala.practise;

abstract class Account {

	double balance;
	
	Account(double balance) {
		this.balance = balance;
	}
	
	abstract void calculateIntrest();
	
	void showBalance() {
		System.out.println(balance);
	}
	
}

class SavingsAccount extends Account {
	
	double interestRate = 5.0;
	
	SavingsAccount(double balance){
		super(balance);
	}
	
	@Override
	void calculateIntrest() {
		double intrest  = (balance * interestRate)/ 100;
		balance += intrest;
		System.out.println("Intrest added: " + intrest);
	}
	
}

class CurrentAccount extends Account {
	
	CurrentAccount(double balance){
		super(balance);
	}
	
	void calculateIntrest() {
		System.out.println("No Intrest for CurrentAccount ");
	}

	
}
