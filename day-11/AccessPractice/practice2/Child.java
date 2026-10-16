package AccessPractice.practice2;

import AccessPractice.practice1.Parent;

public class Child extends Parent {

    public void test() {

        System.out.println(age);

        display();
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.test();
    }
}