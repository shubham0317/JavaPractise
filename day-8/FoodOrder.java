class FoodOrder {

    public static void main(String[] args) {

        String payment = args[0];

        if (payment.equals("UPI") || payment.equals("Card")) {
            System.out.println("Order Placed");
        } else {
            System.out.println("Payment Method Not Supported");
        }
    }
}