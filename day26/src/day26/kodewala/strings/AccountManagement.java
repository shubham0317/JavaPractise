package day26.kodewala.strings;

public class AccountManagement {

	final  int UPI_LIMIT = 1000;
	
	public final void doSomething() {
		// cant be possible to change the thing ones declared as final
		//UPI _LIMIT = "2000";    
		System.out.println("Inside final method");
	}
	
	public void doSomething2() {
		System.out.println("Inside doSomething method");
	}
	
}

class Account extends AccountManagement {
	
	@Override
	public void doSomething2() {
		System.out.println("Inside Account doSomething 2");
	}
	
}
