package day19.kodewala.array.practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Java is Easy";
		
		String [] strArray = s.split(" ");
		
		StringBuilder newStr =  new StringBuilder("");
		
		for(int i = 0 ; i < strArray.length; i++) {
			for(int j = strArray[i].length() - 1; j >= 0; j--) {
				newStr.append(strArray[i].charAt(j));
			}
			if(i < strArray.length - 1) {
				newStr.append(" ");
			}
			
			
		}
		
		System.out.println(newStr);
	}
	
}
