package day16.kodewala.practice;

class Restaurant {

    int restaurantId;
    String restaurantName;
    String location;

    Restaurant() {
        this(101);
    }

    Restaurant(int restaurantId) {
        this(restaurantId, "Dominos");
    }

    Restaurant(int restaurantId, String restaurantName) {
        this(restaurantId, restaurantName, "Bangalore");
    }

    Restaurant(int restaurantId, String restaurantName, String location) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.location = location;
    }

    void display() {

        System.out.println("Restaurant ID: " + restaurantId);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        r.display();
    }
}