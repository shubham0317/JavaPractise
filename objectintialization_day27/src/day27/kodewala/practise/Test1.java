package day27.kodewala.practise;

public class Test1 {
	{
        System.out.println("Instance block");
    }

    Test1() {
        this(10);
        System.out.println("No-arg constructor");
    }

    Test1(int x) {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        new Test1();
    }
}
