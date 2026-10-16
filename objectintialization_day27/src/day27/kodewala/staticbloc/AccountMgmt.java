package day27.kodewala.staticbloc;

class AccountMgmt {
	
	public  AccountMgmt() {
		
   System.out.println("");
   
	}
}

class Account extends AccountMgmt {
	
	 String  accountNumber;
	 
	 {
		 System.out.println("Account IIB");
	 }

	 public Account(String accountNumber) {
		super();
		System.out.println("Account (String accountNumber)");
		this.accountNumber = accountNumber;
	 }
	 
	 
}
