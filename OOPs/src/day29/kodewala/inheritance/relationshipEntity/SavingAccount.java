package day29.kodewala.inheritance.relationshipEntity;

public class SavingAccount extends Account {
  
	public void openSavingAccount(String name, String address, String type) {
		openBankAccount(name, address, type);
	}
}
