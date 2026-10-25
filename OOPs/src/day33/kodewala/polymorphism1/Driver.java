package day33.kodewala.polymorphism1;


class User {
	
}

class AdminUser extends User {
	
}

class FinanceUser extends User {
	
}

public class Driver {

	User u1 = new User(); //User class is Referring user class object
	AdminUser ad = new AdminUser();   //AdminUser class is Referring AdminUser class object
	
	
	User u =  new AdminUser();  //Parent class can refer child class object --> auto upCasting
	
	AdminUser adu = (AdminUser)new User(); //Child class is referring parent class object --> downCasting 
	
	
	
}
