class HollowRightTriangle {
 
   public static void main(String[] args) {
   
    int n = Integer.parseInt(args[0]);
	
	for(int i = 1; i <= n; i++) {
	  for(int j = 1; j <= i; j++) {
	    if(j == 1 || i == n || j == i){
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
	  }
	  System.out.println();
	}
   
   }
 

}