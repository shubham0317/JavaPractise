package day28.kodewala.practise;

public class Test {
 
	public static void main(String[] args) {
		 String s1 = "kodewala";
		 String s2 = "   kodewala  ";
		 System.out.println(s1 == s2);
		 System.out.println(s1.indexOf("w"));
		 System.out.println(s1.indexOf("W"));
		 System.out.println(s1.lastIndexOf("a"));
		 System.out.println(s1.substring(1));
		 System.out.println(s1.substring(1, 4));
		 System.out.println(s2.trim() == s1);
		 System.out.println(s1 == s2);
		 System.out.println(s1.replace('a', 's'));
		 
	}
}
