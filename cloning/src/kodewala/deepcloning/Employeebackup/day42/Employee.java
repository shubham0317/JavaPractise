package kodewala.deepcloning.Employeebackup.day42;

public class Employee implements Cloneable{

	String empName;
	Department dep;
	public Employee(String empName, Department dep) {
		super();
		this.empName = empName;
		this.dep = dep;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.dep = (Department) dep.clone();
		return e;
	}
}
