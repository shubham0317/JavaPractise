package com.kodewala.memoryLeak.pratice;

class Student {
	int id;

	public Student(int id) {
		super();
		this.id = id;
	}
	
}

public class Driver {

	static void display() {

		Student e1 = new Student(101);
		Student e2 = new Student(102);

		Student e3 = e1;

        e1 = null;
        e2 = null;
    }

    public static void main(String[] args) {

        display();

        System.out.println("Hello Java");
    }
}


