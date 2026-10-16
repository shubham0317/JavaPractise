package day27.kodewala.practise;

public class Test4 {
	 static int x = 10; // 15 -> 17 -> 20 -> 22 -> 25

	    static {
	        x = x + 5; //15
	        System.out.println("Static: " + x);
	    }

	    {
	        x += 2; //17 -> 22
	        System.out.println("Instance: " + x);
	    }

	    Test4() {
	        x += 3; //20 -> 25
	        System.out.println("Constructor: " + x);
	    }

	    public static void main(String[] args) {
	        new Test4();
	        new Test4();
	    }
}
