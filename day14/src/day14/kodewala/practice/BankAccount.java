package day14.kodewala.practice;

public class BankAccount {

	
	int accountNumber ;
	String holderName;
	double balance ;
	
	BankAccount(int accountNumber, String holderName, double balance){
		
		/*  'this' refers to the current object's instance variable.
		 * Without 'this', Java treats 'accountNumber' as the constructor parameter 
		 * so the parameter gets assigned to itself and the instance variable remains unchanged.
		  */
		accountNumber = accountNumber;
		holderName = holderName;
		balance = balance;
	}
	
	void display() {
		System.out.println("Account Number: " + accountNumber + " Account Holder: " + holderName + " Balance " + balance );
	}
	
	
	
	
}
