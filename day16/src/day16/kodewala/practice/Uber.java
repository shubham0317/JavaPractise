package day16.kodewala.practice;

class Ride {

    int rideId;
    String customerName;
    String pickup;
    String destination;
    double fare;

    Ride() {
        this(101);
    }

    Ride(int rideId) {
        this(rideId, "Shubham");
    }

    Ride(int rideId, String customerName) {
        this(rideId, customerName, "Koramangala", "Whitefield");
    }

    Ride(int rideId, String customerName,
         String pickup, String destination) {

        this(rideId, customerName, pickup, destination, 450);
    }

    Ride(int rideId, String customerName,
         String pickup, String destination, double fare) {

        this.rideId = rideId;
        this.customerName = customerName;
        this.pickup = pickup;
        this.destination = destination;
        this.fare = fare;
    }

    void displayRide() {

        System.out.println("Ride ID: " + rideId);
        System.out.println("Customer: " + customerName);
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: " + fare);
    }

    public static void main(String[] args) {

        Ride r = new Ride();

        r.displayRide();
    }
}