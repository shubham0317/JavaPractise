package com.kodewala.company;

public class Employee  
{
   private int salary = 50000;
   int employeeId = 12;
   protected String department = "IT";
   public String name = "Shubham";
   
   public void display()
   {
     System.out.println(salary);
     System.out.println(employeeId);
     System.out.println(department);
     System.out.println(name);
   }
   
}