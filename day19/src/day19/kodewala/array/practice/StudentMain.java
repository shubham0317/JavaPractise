package day19.kodewala.array.practice;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student("Shubham", 1, 85,"IT",70);
		Student student2 = new Student("Amitesh", 2, 70,"CS",75);
		Student student3 = new Student("Vikas", 3, 72,"ENGEENERING",80);
		Student student4 = new Student("Pratik", 4, 90,"BCOM",85);
		
		Student students[] = new Student[4];
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		
		for(Student s : students) {
			if(s.getMarks() > 75) {
				s.displayMarks();
			}
		}
		
		int higestMarks = displayHigestMarks(students);
		
		System.out.println(students[higestMarks].getStudentName() + " Scored Higest Marks: " + students[higestMarks].getMarks());
		

		
	}
	
	public static int displayHigestMarks(Student [] s) {
		int higestMarks = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < s.length; i++) {
			if(higestMarks < s[i].getMarks()) {
				higestMarks = s[i].getMarks();
				idx = i;
			}
		}
		return idx;
	}
	
}
