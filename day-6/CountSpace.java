class CountSpace {

  public static void main(String[] args) {
  
     String s = args[0];
	 int count = 0;
	 for(int i = s.length() - 1; i >= 0;  i--) {
	 if(s.charAt(i) == ' ') {
	   count++;
	 }
	}
    
    System.out.println("Count is : " + count);	
  
  }

}