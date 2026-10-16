package day16.kodewala.practice;

class GroceryOrder {

    int orderId;
    String customerName;
    String productName;
    int quantity;
    double price;

    GroceryOrder() {
        this(5001);
    }

    GroceryOrder(int orderId) {
        this(orderId, "Shubham");
    }

    GroceryOrder(int orderId, String customerName) {
        this(orderId, customerName, "Milk");
    }

    GroceryOrder(int orderId, String customerName,
                 String productName) {

        this(orderId, customerName, productName, 2, 90);
    }

    GroceryOrder(int orderId, String customerName,
                 String productName, int quantity,
                 double price) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        GroceryOrder order = new GroceryOrder();

        order.display();
    }
}
