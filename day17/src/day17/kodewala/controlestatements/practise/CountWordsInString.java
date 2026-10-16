package day17.kodewala.controlestatements.practise;

public class CountWordsInString {
	
	public static void main(String[] args) {
		String str = "Java is a Programming lanuage";
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println("No of words in string is: " + (count + 1));
		
	}

	
	
	
}
