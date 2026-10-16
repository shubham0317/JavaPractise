package day29.kodewala.inheritance.practise;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
   
	private String teacherName;
	private List<Subject> subjects;

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
		this.subjects = new ArrayList<>();
		
	}
	
	public void addSubjects(Subject subject) {
		subjects.add(subject);
	}
	
	public void getSubjectList(){
		System.out.println(teacherName + " Teaches this Subject");
		for(Subject sub: subjects) {
			System.out.println(" -" + sub.getSubjectName());
		}
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
}
