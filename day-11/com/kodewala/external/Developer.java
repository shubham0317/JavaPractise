package com.kodewala.external;
import com.kodewala.company.Employee;

public class Developer  extends Employee
{
   
     
	 public void test()
	 {
	 
	 //System.out.println(salary);
     //System.out.println(employeeId);
     System.out.println(department);
     System.out.println(name);
	   
	 }
	 
	 public static void main(String[] args)
	 {
	  Developer d = new Developer();
	  d.test();
	 }
   
}