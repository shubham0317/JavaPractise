package day24.kodewala.string.practise;

public class Practise11 {
    public static void main(String [] args) {
    	String s1 = "Java";
    	String s2 = new String("Java");
    	String s3 = s2.intern();

    	String s4 = "Ja" + "va";

    	String x = "Ja";
    	String y = "va";
    	String s5 = x + y;

    	System.out.println(s1 == s2);  //false
    	System.out.println(s1 == s3);   // true
    	System.out.println(s1 == s4);  // true
    	System.out.println(s1 == s5);  // false

    	System.out.println(s1.equals(s5)); //true
    }
}
