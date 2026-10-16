package day15.kodewala.practise;

public class CountVowels {

	public static void main(String[] args) {
		String str = "shubham";
		String vowels = "aeiouAEIOU";
		int countVowel = 0;
		int countConsonent = 0;
		
		for(int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if(vowels.indexOf(ch) != -1) {
				countVowel++;
			} else {
				countConsonent++;
			}
		}
		
		System.out.println("Vowel Count: " + countVowel);
		System.out.println("Consonent Count: " + countConsonent);
	}
	
}
