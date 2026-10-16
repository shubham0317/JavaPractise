package day26.kodewala.practise;

public class Practise2 {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";

		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		String s5 = "AB";

		System.out.println(s3 == s5);
		System.out.println(s4 == s5);
		System.out.println(s3.equals(s4));
	}
}
