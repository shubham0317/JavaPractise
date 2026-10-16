package day16.kodewala.practice;

class Payment {

    int paymentId;
    double amount;
    String paymentMethod;
    String status;

    Payment() {
        this(9001);
    }

    Payment(int paymentId) {
        this(paymentId, 1299);
    }

    Payment(int paymentId, double amount) {
        this(paymentId, amount, "UPI");
    }

    Payment(int paymentId, double amount,
            String paymentMethod) {

        this(paymentId, amount, paymentMethod, "SUCCESS");
    }

    Payment(int paymentId, double amount,
            String paymentMethod, String status) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    void display() {

        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        Payment p = new Payment();

        p.display();
    }
}