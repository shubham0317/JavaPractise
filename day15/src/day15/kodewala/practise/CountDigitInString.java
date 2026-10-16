package day15.kodewala.practise;

public class CountDigitInString {


	public static void main(String[] args) {
		
		String str = "java123";
		int digitCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		
		System.out.println("Digit Count: " + digitCount);
		
	}
	
}
