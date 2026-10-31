package interfacecode.practise;

public class BankingSystem {

	public static void main(String [] args ) {
		Customer customer = new Customer();
		customer.deposit(5000);
		customer.applyLoan(2000000);
	}
}
