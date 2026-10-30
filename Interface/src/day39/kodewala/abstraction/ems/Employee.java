package day39.kodewala.abstraction.ems;

public  abstract class Employee {

	
	protected int employeeId;
	protected String employeeName;
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public abstract double calculateSalary();
	
	public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
	
}
