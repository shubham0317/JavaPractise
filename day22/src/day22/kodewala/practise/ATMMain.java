package day22.kodewala.practise;

public class ATMMain {

	public static void main(String[] args) {
		
		ATM a1 = new SavingsAccountATM(200000);
		a1.deposit(200);
		a1.withdraw(-1);
		a1.withdraw(100001);
		a1.checkBalance();
		
		
	}
	

	
}
