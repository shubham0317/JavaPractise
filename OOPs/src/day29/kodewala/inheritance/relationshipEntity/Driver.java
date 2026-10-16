package day29.kodewala.inheritance.relationshipEntity;

public class Driver {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.openSavingAccount("Shubham ", "Bengaluru ", "Savings");
		
		Manager emp =  new Manager();
		emp.dosomething();
		
	}
	
}
