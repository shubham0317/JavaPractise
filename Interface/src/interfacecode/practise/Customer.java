package interfacecode.practise;

public class Customer implements BankService, LoanService{

	@Override
	public void deposit(double amount) {
		System.out.println(" Deposited: ₹" + amount);
		
	}

	@Override
	public void applyLoan(double amount) {
		System.out.println(" Loan applied for: ₹" + amount);
		
	}

}
