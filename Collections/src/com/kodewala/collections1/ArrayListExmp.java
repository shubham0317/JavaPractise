package com.kodewala.collections1;

import java.util.ArrayList;




/*
 * Hierarchy in Collections -> List , Map, Set 
 * Inside List -> ArrayList, LinkedList
 * List can store duplicate values and in an Ordered way, apart from that it can 
 * store multiple null values...
 */

public class ArrayListExmp {

	public static void main(String[] args) {
		ArrayList<String> learners = new ArrayList<String>();
		learners.add("Shubham");
		learners.add("Prince");
		learners.add("Aman");
		learners.add("Shubham");
		learners.add("Aman");
		learners.add("Vaibhav");
		learners.add(null);
		learners.add(null);
		
		
		System.out.println(learners);
	}
}
