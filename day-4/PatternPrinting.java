import java.util.*;
class PatternPrinting {

    public static void main(String [] args) {
	     int n = Integer.parseInt(args[0]);
		 
		 for (int i = 1; i <= n; i++) {
		     for(int j = n - i + 1; j > 0; j-- ) {
			  System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}