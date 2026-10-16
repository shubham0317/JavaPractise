package day23.kodewala.practise;

public class StringTest11 {

	 public static void main(String[] args) {

	        String first = "Java";
	        String second = "Java";

	        String third = new String("Java");
	        String fourth = new String("Java");

	        String fifth = third;

	        System.out.println(first == second);
	        System.out.println(first == third);
	        System.out.println(third == fourth);
	        System.out.println(third == fifth);

	        System.out.println(first.equals(third));
	        System.out.println(third.equals(fourth));
	    }
	
}
