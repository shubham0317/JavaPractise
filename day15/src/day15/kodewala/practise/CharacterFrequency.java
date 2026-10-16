package day15.kodewala.practise;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String str =  "hello";
		char [] arr =  str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '0') {
				continue;
			}
			
			int count = 1;
			for(int j = i +1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			System.out.println(arr[i] + " = " + count);
		}
		
	}
	
	
}
