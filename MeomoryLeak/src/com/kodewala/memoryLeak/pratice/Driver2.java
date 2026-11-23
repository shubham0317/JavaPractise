package com.kodewala.memoryLeak.pratice;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {

	static List<Employee> e =  new ArrayList<>();
	
	public static void main(String [] args) {
		
		for(int i = 0; i <  5; i++) {
			Employee emp =  new Employee(i,"1");
			e.add(emp);
			emp = null;
			
			
			
		}
		for (Employee em : e) {
			if(em instanceof Employee) {
				System.out.println("true");
			}
		}
		
	}
	
}
