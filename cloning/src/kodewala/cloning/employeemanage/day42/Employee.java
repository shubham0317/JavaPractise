
package kodewala.cloning.employeemanage.day42;

public class Employee implements Cloneable{

	String id;
	String name;
	Department dept;
	
	public Employee(String id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
