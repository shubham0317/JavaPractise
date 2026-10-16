package day26.kodewala.practise;

public class SubarrySum {
      public static void main(String[] args) {
    	    int []arr =  {1,1,1};
    	    int ans = doOperation(arr, 2);
    	    System.out.println(" Count is : " + ans);
      }
      
      /*
       * This is brute force solution for subarraysum 
       */
      public static int doOperation(int [] arr, int k) {
    	  
    	  int count = 0;
    	  
    	   for (int i = 0; i < arr.length; i++) {
    		   int sum = 0;
    		   for(int j =  1;  j < arr.length; j++) {
    			   sum += arr[j];
    			   if(sum == k) {
    				   count++;
    			   }
    		   }
    		  
    	   }
    	   return count;
      }
}
