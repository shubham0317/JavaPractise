package kodewala.day20.scanner.practise;

public class Employee {

	String workh = "4h";
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee Name: " + name + " and salary is" + salary);
	}
	
	void calculateSalary() {
		System.out.println(" Employee salary calulation");
	}
	
	void displayW() {
		System.out.println(workh);
	}
	
}

class Manager extends Employee {
	
	String workh = "5h";
	String department;
	
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	void display() {
		super.display();
		System.out.println(" Department is: " + department);
	}
	
	
	void calculateSalary() {
		System.out.println("Manager salary = basic salary + bonus");
	}
	
	void displayW() {
		System.out.println(workh);
	}

}

class Developers extends Employee {
     
	String workh = "6h";
	String role;
	public Developers(String name, double salary, String role) {
		super(name, salary);
		this.role = role;
	}
	void calculateSalary() {
		System.out.println(" Developer salary = basic salary + project allowance");
	}
	
	
}
