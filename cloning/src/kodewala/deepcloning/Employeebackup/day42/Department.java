package kodewala.deepcloning.Employeebackup.day42;

public class Department implements Cloneable{

	String department;

	public Department(String department) {
		super();
		this.department = department;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
