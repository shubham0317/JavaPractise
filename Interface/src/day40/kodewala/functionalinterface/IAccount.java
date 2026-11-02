package day40.kodewala.functionalinterface;


@FunctionalInterface

/*
 * Function interface should have only one abstract method apart from that
 * it can have multiple default, static method but it should have only one default method then it 
 * will be treated as FunctionalInterface.
 */


/*
 * if we are extending a interface and it have already one abstract method
 * so in our extending interface we got two abstract method and that interface 
 * is no more functional interface.
 */
public interface IAccount extends IAccountMgmt {

	String  openAccount(String name, String address, int amount); //only one abstract method (SAM) single abstract method
	
	default void addBenificiary() {
		
	}
	
}
