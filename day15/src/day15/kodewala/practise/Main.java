package day15.kodewala.practise;

class College {
    String collegeName;

    College() {
        this("GGU");
        System.out.println("College Default Constructor");
    }

    College(String collegeName) {
        this.collegeName = collegeName;
        System.out.println("College Parameterized Constructor");
    }
}

class Course extends College {
    String courseName;

    Course() {
        this("BCA");
        System.out.println("Course Default Constructor");
    }

    Course(String courseName) {
        super("GGU Bilaspur");
        this.courseName = courseName;
        System.out.println("Course Parameterized Constructor");
    }
}

class Student extends Course {
    int studentId;

    Student() {
        this(101);
        System.out.println("Student Default Constructor");
    }

    Student(int studentId) {
        super("Computer Applications");
        this.studentId = studentId;
        System.out.println("Student Parameterized Constructor");
    }
}

class Address extends Student {
    String city;

    Address() {
        this("Bilaspur");
        System.out.println("Address Default Constructor");
    }

    Address(String city) {
        super(101);
        this.city = city;
        System.out.println("Address Parameterized Constructor");
    }
}

public class Main extends Address {

    Main() {
        this("Shubham");
        System.out.println("Main Default Constructor");
    }

    Main(String name) {
        super("Bangalore");
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println("College: " + obj.collegeName);
        System.out.println("Course: " + obj.courseName);
        System.out.println("Student ID: " + obj.studentId);
        System.out.println("City: " + obj.city);
    }
}