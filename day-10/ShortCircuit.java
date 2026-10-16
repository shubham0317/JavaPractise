class ShortCircuit {
   public static void main(String[] args) {
    int a = 10;
	if(a > 5 && ++a > 10) {
	System.out.println("YES");
	}
	System.out.println(a);
   }
}