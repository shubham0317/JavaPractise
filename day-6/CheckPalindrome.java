class CheckPalindrome {

   public static void main(String[] args) {
   String word = args[0];
   String original = word;
   
   String rev = "";
	for(int i = word.length() - 1; i >= 0;  i--) {
	 rev += word.charAt(i);
	}
    
    System.out.println("Reversed string: " + rev);	
	
	if(original.equals(rev)) {
	 System.out.println("Its Palindrome");	
	} else {
		System.out.println("Its not palindrome");
	}
   }

}