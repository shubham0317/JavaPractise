public class Employees {
     int empId;
     String name;
	 String department;
	 int age;
	 
	 Employees(int empId,String name, String department, int age){
	  this.empId = empId;
	  this.name = name;
	  this.department = department;
	  this.age = age;
	 }
	 
	 public void showEmp(){
	 System.out.println("empId is "+ empId);
	 System.out.println("name is "+ name);
	 System.out.println("department is "+ department);
	 System.out.println("age is "+ age);
	 }
}

class ObjCreation{

    public static void main(String[] args){
	 Employees e1 = new Employees(1,"Shubham","IT",23);
	 e1.showEmp();
	}

}