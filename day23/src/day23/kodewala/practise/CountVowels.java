package day23.kodewala.practise;

public class CountVowels {
	 public static void main(String[] args) {

	        String word = "education";
	        int count = 0;

	        for (int i = 0; i < word.length(); i++) {

	            char ch = word.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Vowels: " + count);
	    }
}
