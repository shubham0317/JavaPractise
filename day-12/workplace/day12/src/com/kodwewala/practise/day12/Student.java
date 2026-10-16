package com.kodwewala.practise.day12;

class Student {
	static String schoolName = "MVM";
    String name;
    int rollNum;
    int marks;

    Student(String name, int rollNum , int marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }
    
   void displayStuent() {
    	System.out.println("Student name is " + name + " rollNum: " + rollNum + " marks " + marks + " School name " + schoolName);
    }
    
  
}

