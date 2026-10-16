package day24.kodewala.string.practise;

public class practise4 {
    public static void main(String[] args) {
    	String a = new String("Java");
    	String b = new String("Java");

    	String c = a.intern();
    	String d = b.intern();

    	System.out.println(a == b);
    	System.out.println(c == d);
    	System.out.println(c == "Java");
    	
 
 
    }
}
