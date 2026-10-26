package day35.kodewala.foodorderring;

public class CardPayment implements Payment{

	@Override
    public void pay(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Payment amount must be greater than zero"
            );
        }

        System.out.println(
            "Card payment successful: Rs. " + amount
        );
    }
}
