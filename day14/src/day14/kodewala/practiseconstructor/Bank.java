package day14.kodewala.practiseconstructor;

public class Bank {
	
	protected String bankName;
	
	Bank(){
		System.out.println(" Inside Bank Default Constructor");
	}
	
	Bank(String _bankName){
		this.bankName = _bankName;
		System.out.println(" Inside Bank 1  parametrized Constructor");
	}

}

class Account extends Bank {
	
	int accountNum;
	String holderName;
	
	Account(){
		System.out.println(" Inside Acc Defaut Constructor");
	}
	
	Account(String bankName){
		//super(bankName);
		System.out.println(" Inside Acc 1 parametrized Constructor");
	}
	
	Account(String bankName,int accountNum, String holderName) {
		this(bankName);
		this.accountNum = accountNum;
		this.holderName = holderName;
		System.out.println(" Inside Acc 3 parametrized Constructor");
	}
	
}


class SavingsAccount extends Account{
	
	double balance;
	double inresteRate;
	
	SavingsAccount(){
		System.out.println(" Inside SA Default Constructor");
	}
	
	SavingsAccount(String bankName,int accountNum, String holderName, double balance, double inresteRate){
		super(bankName, accountNum, holderName);
		this.balance = balance;
		this.inresteRate = inresteRate;
		System.out.println(" Inside SA 5 parametrized Constructor");
		
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNum);
		System.out.println("Account Holder: " + holderName);
		System.out.println("Balance : " + balance);
		System.out.println("Intrest Rate: " + inresteRate);
	}
	
}
