package day40.kodewala.markerinterface;

public class Driver  {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Account acc =  new Account("Kodewala", "BTM Banglore", "7890653425");

	    Account cloneObjOfAcc = (Account) acc.clone();
	    System.out.println(cloneObjOfAcc.accNo);
	    
	    if (acc instanceof Cloneable) {
	    	System.out.println(" True.... allowed to perform the activity...");
	    } else {
	    	System.out.println("False");
	    }
	    
	}
	
}
