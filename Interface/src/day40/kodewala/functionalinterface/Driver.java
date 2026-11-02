package day40.kodewala.functionalinterface;

public class Driver {
	
	/*
	 * IF we are writing lambda expression we don't need to implement any class we can direct write 
	 * the  lambda function.
	 *  
	 * In lambda expression we only need to write how part of the function with
	 * () -> and that is lambda expression
	 */

	public static void main(String [] args) {
		IAccount account = (name, address, amount) -> 
		{
			System.out.println(" Opening Account....  For " + name);
			return "Account opend";
		};
		
		String result  = account.openAccount("Shubham", "BTM", 500);
		System.out.println(result);
	}
}
