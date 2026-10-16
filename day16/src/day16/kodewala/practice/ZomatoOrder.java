package day16.kodewala.practice;

class ZomatoOrder {

    int orderId;
    String customerName;
    String restaurantName;
    double amount;

    ZomatoOrder() {
        this(1001);
    }

    ZomatoOrder(int orderId) {
        this(orderId, "Shubham");
    }

    ZomatoOrder(int orderId, String customerName) {
        this(orderId, customerName, "Burger King");
    }

    ZomatoOrder(int orderId, String customerName,
                String restaurantName) {

        this(orderId, customerName, restaurantName, 450);
    }

    ZomatoOrder(int orderId, String customerName,
                String restaurantName, double amount) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.amount = amount;
    }

    void display() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {

        ZomatoOrder o = new ZomatoOrder();

        o.display();
    }
}
