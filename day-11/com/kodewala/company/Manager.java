package com.kodewala.company;

public class Manager
{

   public static void main(String[] args)
   {
     Employee emp = new Employee();
	 //System.out.println(emp.salary);   in same package only private is not accessible
	 System.out.println(emp.employeeId);
	 System.out.println(emp.department);
	 System.out.println(emp.name);
   }
 
}