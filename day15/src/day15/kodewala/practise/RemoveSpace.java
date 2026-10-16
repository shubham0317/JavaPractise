package day15.kodewala.practise;

public class RemoveSpace {
	
	
	public static void main(String[] args) {
		String str = "hello World java";
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			} else {
				newStr += str.charAt(i);
			}
		}
		
		System.out.println(newStr);
		
	}

}
