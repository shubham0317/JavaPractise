package day16.kodewala.practice;

class AmazonProduct {

    int productId;
    String productName;
    double price;
    String brand;

    AmazonProduct() {
        this(1001);
    }

    AmazonProduct(int productId) {
        this(productId, "iPhone 16");
    }

    AmazonProduct(int productId, String productName) {
        this(productId, productName, 69999);
    }

    AmazonProduct(int productId, String productName, double price) {
        this(productId, productName, price, "Apple");
    }

    AmazonProduct(int productId, String productName,
                  double price, String brand) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
    }

    void display() {

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {

        AmazonProduct p = new AmazonProduct();

        p.display();
    }
}
