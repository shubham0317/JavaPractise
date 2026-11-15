
public class Driver {
	
	Address address;
	Employee emp;

	public  void doSomething() {
		
		address = new Address("BTM","Bengaluru");
		emp = new Employee("EMP1", "Shubham", "23", address);
		
		System.out.println(emp + " " + address);
		
		emp = null;
		address =  null;
		
		
	}
	
	
}
