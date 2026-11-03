package day40.com.employeeMgmt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	 public static void main(String[] args) throws IOException, ClassNotFoundException {
		 
		 List <Employee> emps = new ArrayList<>();
		 EmployeeBackupService ebs = new EmployeeBackupService();
		 
		 
		 Employee e1 = new Employee("EMP1","Rahul","Development", 70000);
		 Employee e2 = new Employee("EMP2","Shubham","Development", 80000);
		 Employee e3 = new Employee("EMP3","Sujal","Research", 75000);
		 
		 emps.add(e1);
		 emps.add(e2);
		 emps.add(e3);
		 
		 ebs.saveEmployee(emps);
		 
		 
		 List <Employee> els = (ArrayList<Employee>) ebs.loadEmployee();
		 
		 for (Employee e: els) {
			 System.out.println(e);
		 }
		 
		 ebs.updateEmpsSal(els, 90000, "EMP2");
		 
		 for (Employee e: els) {
			 System.out.println(e);
		 }
		 
		 
		 
	 }
}
