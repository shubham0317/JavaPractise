package day17.kodewala.controlestatements.practise;

public class FirstRepeatingCharacte {
	public static void main(String [] args) {
		
	      String str = "aabbcdde";
	      
	      char result = ' ';
	      
	      for(int i = 0; i < str.length(); i++) {
	    	  boolean isRepeating = false;
	    	  
	    	  for(int j = 0; j < str.length(); j++) {
	    		  if(i != j && str.charAt(i) == str.charAt(j)) {
	    			  isRepeating = true;
	    		  }
	    	  }
	    	  if (isRepeating) {
	              result = str.charAt(i);
	              break;
	          }
	      }
	      
	      if (result != ' ') {
	          System.out.println("Output: " + result);
	      } else {
	          System.out.println("No unique character found.");
	      }
			
		}
}
