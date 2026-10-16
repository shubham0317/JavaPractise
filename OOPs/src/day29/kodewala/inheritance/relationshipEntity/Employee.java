package day29.kodewala.inheritance.relationshipEntity;

public class Employee {
   
	String name = "Amit";
	String address = "Bengaluru";
	
	private String empCode = "E1234";
	
	public void markIn(String empId) {
		System.out.println("Marking in " + name);
	}
}

class Manager extends Employee {
	public void dosomething() {
		System.out.println(name);
		System.out.println(address);
		
		markIn(address);
	}
	
}