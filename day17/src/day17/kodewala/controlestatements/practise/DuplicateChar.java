package day17.kodewala.controlestatements.practise;

public class DuplicateChar {

	public static void main(String[] args) {
         String str = "programming";
		
	    char [] arr = str.toCharArray();
	    
	    for(int i = 0; i < arr.length; i++) {
	    	
	    	if(arr[i] =='0') {
	    		continue;
	    	}
	    	int count = 1;
	    	for(int j = i + 1; j < arr.length; j++) {
	    		if(arr[i] == arr[j]) {
	    			count++;
	    			arr[j] = '0';
	    		}
	    	}
	    	
	    	if(count > 1) {
	    		System.out.println(arr[i] + " This i unique ");
	    	}
	    	
	    }
		
	}
	
}
