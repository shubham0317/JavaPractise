package day16.kodewala.practice;

public class Bank {
   String bankName;
   
   Bank(String _bankName) {
	   this.bankName = _bankName;
   }
   
   Bank(){
	   this("SBI");
   }
   
}

class Customer extends Bank {
	
	String accountHolderName;
	String accountNumber;
	String balance;
	String phoneNumber;
	
	public Customer(String _bankName, String _accountHolderName, String _accountNumber, String _balance,
			String _phoneNumber) {
		super(_bankName);
		this.accountHolderName = _accountHolderName;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
		this.phoneNumber = _phoneNumber;
		System.out.println("Account created sucessfully");
	}
	
	public Customer() {
		this("SBI","Dummy","0000000","0","000000000");
	}
	
	
	
	
}
