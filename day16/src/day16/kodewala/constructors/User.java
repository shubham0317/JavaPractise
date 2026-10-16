package day16.kodewala.constructors;


/**
 * This is the class for creating amazone prime User
 */

public class User {

	String name;
	String number;
	String country;
	
	
	
	User(String _name, String _number, String _country) {
		this.name = _name;
		this.number = _number;
		this.country = _country;
		System.out.println(" User created sucessfully ");
	}
	
	User(){
		this("guest","999999999","INDIA");
	}
	
}
