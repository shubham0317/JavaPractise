package day27.kodewala.practise;


class A {
    static int x = 1; //-> 3,

    static {
        x += 2;
        System.out.println("A static: " + x);
    }

    int y = 10; // 15 --> 25

    {
        y += 5;
        System.out.println("A block: " + y); //15
    }

    A() {
        y += 10;
        System.out.println("A constructor: " + y); // 25
    }
}

class B extends A {
    static int z = 5; //z --> 8

    static {
        z += 3; 
        System.out.println("B static: " + z);
    }

    int y = 100; // -> 

    {
        y += 20;
        System.out.println("B block: " + y); // 120
    }

    B() {
        this(50);
        System.out.println("B no-arg constructor: " + y); //120
    }

    B(int n) {
        System.out.println("B parameterized constructor: " + y); //120
    }
}

public class Test3 {
    public static void main(String[] args) {
        new B();
        System.out.println("-----");
        new B(10);
    }
}


