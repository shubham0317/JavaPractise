package day25.kodewala.strings;

public class Driver {

	public static void main(String[] args) {
		String s1 = "This " + "is from" + " Kodewala Academy Banglore";
		
		System.out.println(s1);
		

		String s2 = "Kodewala";
		String s3 = "Academy";

		String s4 = s2 + s3;
		String s5 = "KodewalaAcademy";

		
		
		
//		System.out.println(s4 == s5);
//		System.out.println(s4.intern() == s5);
		
		final String s7 = "Shubham";
		final String s6 = " Kodewala";
		String s8 = "Shubham Kodewala";
		String s9 = s7 + s6;
		System.out.println(s8 == s9);
		

	}
	
}
