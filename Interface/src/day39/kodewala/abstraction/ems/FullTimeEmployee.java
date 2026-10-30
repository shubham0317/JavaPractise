package day39.kodewala.abstraction.ems;

public class FullTimeEmployee extends Employee{

	private double basicSalary;
    private double allowances;
    
	public FullTimeEmployee(int employeeId, String employeeName, double basicSalary, double allowances) {
		super(employeeId, employeeName);
		this.basicSalary = basicSalary;
		this.allowances = allowances;
	}
    
	@Override
    public double calculateSalary() {
        return basicSalary + allowances;
    }
    
	
}
