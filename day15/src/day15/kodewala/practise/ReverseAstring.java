package day15.kodewala.practise;

public class ReverseAstring {
	
	public static void main(String[] args) {
		
		String str = "shubham";
		
		String reversedStr = "";
		
		for(int i = str.length() -1; i  >= 0; i--) {
			System.out.println(str.charAt(i));
			reversedStr += str.charAt(i);
		}
		
		System.out.println("Reversed str: " + reversedStr);
		
	}

}
