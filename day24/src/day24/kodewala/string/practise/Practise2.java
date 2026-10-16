package day24.kodewala.string.practise;

public class Practise2 {
   public static void main(String[] args) {
	   String a = "Java";
	   String b = new String("Java");
	   String c = b.intern();
	   String d = "Java";

	   System.out.println(a == b);
	   System.out.println(a == c);
	   System.out.println(c == d);
	   System.out.println(b == c);
   }
}
