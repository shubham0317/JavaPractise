package day19.kodewala.array.practice;

public class ReverseOrderOfWord {

	public static void main(String[] args) {
		String str = "Java is easy";
		String [] ch = str.split(" ");
		StringBuilder sb =  new StringBuilder();
		
		for(int i = ch.length -1; i >= 0; i--) {
			sb.append(ch[i]);
			if(i > 0) {
				sb.append(" ");
			}
		}
		
		System.out.println(sb);
		
	
	}
	
}
