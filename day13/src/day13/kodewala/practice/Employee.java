package day13.kodewala.practice;

public class Employee {
	
	String name;
	
	Employee(String  name) {
		this.name = name;
		System.out.println(name + " is an Employee ");
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("shubham", "IT");
		
	}

}
class Manager extends Employee {
	String department;
	
	Manager(String name, String department) {
		super(name);
		this.department = department;
		System.out.println(name + " is a Manager of " + department);
	}
	
	
}
