package day16.kodewala.practice;

class Product {

    int productId;
    String productName;
    double price;

    Product() {
        this(101);
    }

    Product(int productId) {
        this(productId, "Milk");
    }

    Product(int productId, String productName) {
        this(productId, productName, 45.0);
    }

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Product p = new Product();

        p.display();
    }
}