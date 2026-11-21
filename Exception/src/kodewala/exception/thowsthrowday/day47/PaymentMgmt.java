package kodewala.exception.thowsthrowday.day47;

public class PaymentMgmt {

	public void doPayment(String accNo, int amount) throws FundTransferException {
		
		try {
			checkBalance(accNo,amount);
		} catch (InsufficiantBalanceException e) {
			
			throw new FundTransferException("You dont have sufficent balance or in case "
					+ "of you opened new account try after 24hr");
		}
	}
	
	public boolean checkBalance(String accNo, int amount) throws InsufficiantBalanceException {
		boolean checkBalStatus = false;
		int balance = 1000;
		if (amount > balance){
			throw new InsufficiantBalanceException(amount +" does not have insufficiant balance, and your current balance is: " + balance);
		} else {
			checkBalStatus = true;
		}
		return checkBalStatus;
	}
}

