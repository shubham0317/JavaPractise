package com.kodwewala.practise.day12;

public class CountObj {

	public static void main(String[] args) {
		CountTotalObject obj = new CountTotalObject();
		CountTotalObject.count++;
		
		CountTotalObject obj1 = new CountTotalObject();
		CountTotalObject.count++;
		
		
		CountTotalObject obj3 = new CountTotalObject();
		CountTotalObject.count++;
		
		obj.showCount();
	}
	
}
