package day15.kodewala.practise;

public class CountSpaceInString {
	
	
	public static void main(String[]  args) {
		String str = "Hello World";
		int spaceCount = 0;
		
		for(int i = 0; i < str.length() ; i++) {
			if(str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		
		System.out.println("Space Count: " + spaceCount);
	}
	
	

}
