package kodewala.exception.day45;

public class Driver {

	public static void main(String[] args) {
		
		Account acc =  new Account();
		String accNo = null;
		String address [] = {"BTM Bengaluru", "JP Nagar"};
		acc.doActivateAcc(accNo, address);
		
	}
}

class Account {
	
	public void doActivateAcc(String acc, String address []) {
		System.out.println("Account.doActivateAcc()...START");
		doValidate(acc, address);
		System.out.println("Account.doActivateAcc()...END");
	}
	
	private boolean doValidate(String acc, String address[]) {
        System.out.println("Account.doValidate()...START");
        
        System.out.println("Validating account details...");
        System.out.println("Checking account status");
        
        int accountType = 1;
        String bankName = "SBI";
        boolean isActivate = true;
        
        System.out.println("Account Type " + accountType);
        System.out.println("Bank Name " + bankName);
        System.out.println("Account Active" + isActivate);
		boolean isValid = false;
		
		try {
			String homeAddress = address[1];
			System.out.println(" HomeAddress :" + homeAddress);
			isValid = acc.startsWith("SBI");
			int amount = 100/0;
			int accNOInt = Integer.parseInt(acc);
		} catch (NullPointerException e) {
			System.out.println(" Value is null");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" You are trying to access invalid index");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println(" Calulation Error");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unknown error");
			e.printStackTrace();
		}
		System.out.println("Account.doValidate()...END");
		return isValid;
	}
	
}
