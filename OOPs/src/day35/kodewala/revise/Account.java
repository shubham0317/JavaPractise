package day35.kodewala.revise;

public class Account {

	private int balance;
	
	public void credit() {
		//check the balance is validate number it should not negative and not be greater the senders balance
		checkBal();
		//Check that the balance is debited from sender
		validatePin("9131");
		//check the balance is credited and 
		//then do the changes in balance
		
		System.out.println(" Successfully Transacation Done ");
	}
	
	private int checkBal() {
		System.out.println(" Account.checkBalance");
		return 2000;
	}
	
	private boolean validatePin(String userId) {
		System.out.println(" Account.validatePin");
		return true;
	}
	
}
