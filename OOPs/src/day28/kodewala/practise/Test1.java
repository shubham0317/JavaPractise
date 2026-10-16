package day28.kodewala.practise;

public class Test1 {

	public static void main(String[] args) {
		String s = "Kodewala,Academeym,BTM,Banglore";
		String [] strArray = s.split(",");
		
		for(String str: strArray) {
			System.out.println(str);
		}
		System.out.println(s.contains("shubham"));
		System.out.println(s.startsWith("shubham"));
		System.out.println(s.endsWith("Banglore"));
	}
}
