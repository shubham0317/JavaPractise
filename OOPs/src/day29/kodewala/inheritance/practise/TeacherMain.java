package day29.kodewala.inheritance.practise;

public class TeacherMain {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Pratik");
		t1.getTeacherName();
		
		Subject s1 = new Subject("Math");
		Subject s2 = new Subject("BIO");
		Subject s3 = new Subject("Chemistry");
		
		
		t1.addSubjects(s1);
		t1.addSubjects(s2);
		t1.addSubjects(s3);
		
		t1.getSubjectList();
		
	}
}
