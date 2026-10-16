package day14.kodewala.practice;

public class Student {
	
	String name;
	int age;
	String course;
	
	
	public Student() {
		System.out.println("Inside   Default constructor");
	}
	
	public Student(String name) {
		this();
		this.name = name;
		System.out.println("Inside single parametrized constructor");
		
	}
	
	public Student(String name, int age) {
		this(name);
		this.name = name;
		this.age = age;
		System.out.println("Inside double parametrized constructor");
	}
	
	public Student(String name, int age, String course) {
		this(name, age);
		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println("Inside three parametrized constructor");
	}
	
	

}
