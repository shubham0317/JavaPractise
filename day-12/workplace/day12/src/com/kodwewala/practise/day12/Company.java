package com.kodwewala.practise.day12;

public class Company {
	
	static int companyCode = 101;
	int empAge ;
	String empName;
	String empDeartemnt;
	
	Company(int empAge,String empName,String empDeartemnt){
		this.empAge = empAge;
		this.empName = empName;
		this.empDeartemnt = empDeartemnt;
	}
	
	void displayEmpDetails() {
		System.out.println("Employee Name is " + empName + " emp age is " + empAge + " department is " + empDeartemnt + " And company code is " + companyCode);;
	}
	

}
