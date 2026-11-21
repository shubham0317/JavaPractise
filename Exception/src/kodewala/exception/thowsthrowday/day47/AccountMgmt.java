package kodewala.exception.thowsthrowday.day47;

import java.io.IOException;

public class AccountMgmt {

	public void openAccount(String accNo) {
		System.out.println("AccountMgmt.openAccount() START");
		
			activateAccount(accNo);

		System.out.println("AccountMgmt.openAccount() END");
	}
	
	public void activateAccount(String accNo) {
		System.out.println("AccountMgmt.activateAccount() START");
		try {
			checkAccountStatus(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("AccountMgmt.activateAccount() END");
	}
	
	public boolean checkAccountStatus(String accNo) throws Exception , IOException {
		System.out.println("AccountMgmt.acountMgmt.checkAccountStatus() START");
		try {
			accNo.startsWith("SBI");
		} catch (NullPointerException e) {
			throw new NullPointerException("Account number does not starting with with SBI");
		}
		System.out.println("AccountMgmt.acountMgmt.checkAccountStatus() END");
	    return false;
	    
	}
}
