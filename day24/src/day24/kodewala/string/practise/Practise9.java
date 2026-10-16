package day24.kodewala.string.practise;

public class Practise9 {
   public static void main(String[] args) {
	   String s1 = "java";
	   String s2 = s1.toUpperCase();
	   String s3 = "JAVA";

	   System.out.println(s1 == s2);
	   System.out.println(s2 == s3);
	   System.out.println(s2.equals(s3));
	   
	   
	   String a = "";
	   String b = new String("");

	   System.out.println(a == b);
	   System.out.println(a.equals(b));
   }
} 
