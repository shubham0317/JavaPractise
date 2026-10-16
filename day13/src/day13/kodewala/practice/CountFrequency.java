package day13.kodewala.practice;

public class CountFrequency {
	
	public static void main(String[] args) {
		
		int [] arr = {12, 14, 1, 12, 14, 3, 5};
		
		int [] visited = new  int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(visited[i] == 1) {
				continue;
			}
			
			int count  = 1;
			for(int j =  i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j] = 1; 
				}
			}
			
			System.out.println("Count of the element " + arr[i] + " is: " + count);
			
		}
		
	}

}
