package day21.kodewala.practise;


abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    abstract void start();
}

class Car extends Vehicle {

    Car() {
        System.out.println("Car constructor");
    }

    void start() {
        System.out.println("Car started");
    }
}

public class Test {
	 public static void main(String[] args) {
	        Vehicle v = new Car();
	        v.start();
	        
	        C c =  new C();
	        c.show();
	    }
}
