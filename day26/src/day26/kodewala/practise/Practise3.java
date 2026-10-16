package day26.kodewala.practise;

public class Practise3 {
     public static void main(String[] args) {
    	 String s1 = new String("Alpha");
    	 String s2 = new String("Beta");

    	 String s3 = s1.intern();
    	 String s4 = s2.intern();

    	 System.out.println(s1 == s3);
    	 System.out.println(s2 == s4);
    	 System.out.println(s3 == "Alpha");
    	 System.out.println(s4 == "Beta");
     }
}
