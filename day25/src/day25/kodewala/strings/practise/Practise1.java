package day25.kodewala.strings.practise;

public class Practise1 {
   public static void main(String[] args) {
	   String s1 = new String("Python");
	   String s2 = s1.intern();
	   String s3 = new String("Python").intern();

	   System.out.println(s1 == s2);
	   System.out.println(s2 == s3);
	   System.out.println(s1.equals(s3));
   }
}
