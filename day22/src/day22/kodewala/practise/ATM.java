package day22.kodewala.practise;

public abstract class ATM {

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	abstract void checkBalance();

}

class SavingsAccountATM extends ATM {

	double balance;

	SavingsAccountATM(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {

		if (amount <= 0) {
			System.out.println("Not a vlid input");
			return;
		}

		if (balance < amount) {
			System.err.println("Insuffisent Balnce");
			return;
		}

		if (amount > 100000) {
			System.err.println("More than 1L Transaction need pan card");
			return;
		}
		balance -= amount;
		System.out.println("Successfull withrawl of " + amount + " is done and updated balance is :" + balance);
	}

	void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Not a vlid input");
			return;
		}

		balance += amount;
		System.out.println("Successfull Deposited " + amount + "  and updated balance is :" + balance);
	}

	void checkBalance() {
		System.out.println("Your balance is " + balance);
	}

}

class CurrentAccountATM extends ATM {

	double balance;

	CurrentAccountATM(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {

		if (amount <= 0) {
			System.out.println("Not a vlid input");
		}

		if (balance < amount) {
			System.err.println("Insuffisent Balnce");
			return;
		}

		balance -= amount;
		System.out.println("Successfull withrawl of " + amount + " is done and updated balance is :" + balance);
	}

	void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Not a vlid input");
		}

		balance += amount;
		System.out.println("Successfull Deposited " + amount + "  and updated balance is :" + balance);
	}

	void checkBalance() {
		System.out.println("Your balance is " + balance);
	}
}
