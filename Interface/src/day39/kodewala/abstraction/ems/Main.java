package day39.kodewala.abstraction.ems;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 =  new FullTimeEmployee(101, "Rahul", 40000, 10000);
		Employee e2 =  new ContractEmployee(102, "Amit", 160, 500);
		
		e1.displayEmployeeDetails();
		System.out.println("Salary:" + e1.calculateSalary());
		
		e2.displayEmployeeDetails();
		System.out.println("Salary:" + e2.calculateSalary());
		
		
		
	}
}
