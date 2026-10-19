package day30.kodewala.inheritance.multilevel;

public class Person {
   String name;
   int age;
   public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
   }
   
   public void showPerson() {
	   System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
}

class Employee extends Person {
	String empId;
	int salary;
	public Employee(String name, int age, String empId, int salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}
	
	public void showPerson() {
		   System.out.println("Name: " + name);
	       System.out.println("Age: " + age);
	       System.out.println("empId: " + empId);
	       System.out.println("salary: " + salary);
	       
	   }
	
}

class DeliveryBoy extends Employee {
	
	String vehicalNumber;

	public DeliveryBoy(String name, int age, String empId, int salary, String vehicalNumber) {
		super(name, age, empId, salary);
		this.vehicalNumber = vehicalNumber;
	}
	
	public void showPerson() {
		   System.out.println("Name: " + name);
	       System.out.println("Age: " + age);
	       System.out.println("empId: " + empId);
	       System.out.println("salary: " + salary);
	       System.out.println("vehicalNumber: " + vehicalNumber);
	   }
	
}
