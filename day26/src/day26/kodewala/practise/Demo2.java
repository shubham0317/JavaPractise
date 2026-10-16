package day26.kodewala.practise;

public class Demo2 {
	public static void main(String[] args) {
		String s1 = new String(new char[] { 'H', 'e', 'l', 'l', 'o', '1', '2', '3' });

		String s2 = s1.intern();

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hello");
		String s4= s3.intern();

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
}
