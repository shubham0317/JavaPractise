package day21.kodewala.practise;

abstract class A {
    abstract void show();
}

interface B {
    void show();
}

public class C extends A implements B {
    public void show() {
        System.out.println("This is message from class c");
    }
}
