package day16.kodewala.practice;

class Customers {

    int customerId;
    String customerName;

    Customers() {
        this(101);
    }

    Customers(int customerId) {
        this(customerId, "Shubham");
    }

    Customers(int customerId, String customerName) {

        this.customerId = customerId;
        this.customerName = customerName;

        System.out.println("Customer Constructor");
    }
}

class FlipkartOrder extends Customers {

    int orderId;
    double amount;

    FlipkartOrder() {
        this(101, "Shubham");
    }

    FlipkartOrder(int customerId, String customerName) {
        this(customerId, customerName, 5001, 2999);
    }

    FlipkartOrder(int customerId, String customerName,
                  int orderId, double amount) {

        super(customerId, customerName);

        this.orderId = orderId;
        this.amount = amount;

        System.out.println("Order Constructor");
    }

    void display() {

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {

        FlipkartOrder order = new FlipkartOrder();

        order.display();
    }
}
