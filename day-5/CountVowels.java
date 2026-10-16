class CountVowels{
 
  public static void main(String[] args) {
   
   String s = args[0];
   int count = 0;
   for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
     if("aeiouAEIOU".indexOf(ch) != -1) {
	   count++;
	 }
   }
   System.out.println("Count of vowels is: " + count);
  
  }

}