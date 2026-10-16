package day19.kodewala.array.practice;

public class Student {

	
	private String studentName;
	private int rollNumber;
	private int marks;
	private  String branch;
	private int attendence;
	public Student(String studentName, int rollNumber, int marks, String branch, int attendence) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.branch = branch;
		this.attendence = attendence;
	}
	public Student() {
		this("guest",00,500,"IT",50);
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}
	
	
	public void displayMarks() {
		System.out.println(studentName + " scored " + marks);
	}
	
	
	
}
