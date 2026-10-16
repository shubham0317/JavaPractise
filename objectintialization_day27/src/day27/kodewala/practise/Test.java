package day27.kodewala.practise;

public class Test {

	static int count = 0;// 3 , 4 , 5 , 6, 7

    static {
        count++;  //1 
        System.out.println("Static: " + count);
    }

    {
        count++;  //2 -> 4 --> 6
        System.out.println("Instance: " + count);
    }

    Test() {
        count++;  //3 -> 5 --> 7
        System.out.println("Constructor: " + count);
    }
    
    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
    }

	
}
