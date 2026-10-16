package day27.kodewala.practise;

public class Test2 {
	int x = 10; // for creating first object -> 20 -> 

    {
        x = 20;
        System.out.println("Block: " + x);
    }

    int y = x + 5;  //25

    Test2() {
        x = 30; 
        System.out.println("Constructor: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
