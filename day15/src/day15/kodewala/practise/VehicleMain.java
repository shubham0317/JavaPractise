package day15.kodewala.practise;

class Vehicle {
    String brand;

    Vehicle() {
        this("Toyota");
        System.out.println("Vehicle Default Constructor");
    }

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Parameterized Constructor");
    }
}

class Car extends Vehicle {
    String model;

    Car() {
        this("Fortuner");
        System.out.println("Car Default Constructor");
    }

    Car(String model) {
        super("Toyota");
        this.model = model;
        System.out.println("Car Parameterized Constructor");
    }
}

class Engine extends Car {
    int engineCC;

    Engine() {
        this(2500);
        System.out.println("Engine Default Constructor");
    }

    Engine(int engineCC) {
        super("Fortuner");
        this.engineCC = engineCC;
        System.out.println("Engine Parameterized Constructor");
    }
}

class Driver extends Engine {
    String driverName;

    Driver() {
        this("Ramesh");
        System.out.println("Driver Default Constructor");
    }

    Driver(String driverName) {
        super(2500);
        this.driverName = driverName;
        System.out.println("Driver Parameterized Constructor");
    }
}

public class VehicleMain extends Driver {

    VehicleMain() {
        this("Bangalore");
        System.out.println("VehicleMain Default Constructor");
    }

    VehicleMain(String location) {
        super("Shubham");
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {

        VehicleMain obj = new VehicleMain();

        System.out.println("Brand: " + obj.brand);
        System.out.println("Model: " + obj.model);
        System.out.println("Engine: " + obj.engineCC);
        System.out.println("Driver: " + obj.driverName);
    }
}