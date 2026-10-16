package day13.kodewala.constructors2;

public class Driver {

	 public static void main(String[] args) {
		 
		 Account acc =  new Account();
		 System.out.println(acc.amount + " and " + acc.name);
		 
		 
		 Account acc1 =  new Account(2000, "Kodewala");
		 System.out.println(acc1.amount + " and " + acc1.name);
		 
		 Account acc2 =  new Account("Kodewala",30000);
		 System.out.println(acc2.amount + " and " + acc2.name);
		 
	 }
	
}
