package day24.kodewala.string.practise;

public class Practice10 {
  public static void main(String[] args) {
	  String a = "Java";
	  String b = "Ja" + "va";
	  String c = new String("Java");
	  String d = c.intern();

	  System.out.println(a == b);
	  System.out.println(a == c);
	  System.out.println(a == d);
	  System.out.println(b == d);
  }
}
