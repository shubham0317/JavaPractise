package day13.kodewala.practice;

public class Bank {

	String bankName;

	Bank(String bankName) {
		this.bankName = bankName;
	}

}

class Customer extends Bank {

	int custId;
	String custName;
	int  custBalance;

	Customer(String bankName, int custId, String custName, int custBalance) {
		super(bankName);
		System.out.println(" Thanks for Choosing " + bankName + " Bank " + custName + " Your Id is: " + custId);
	}
}