package day22.kodewala.practise;

public class PaymentMain {

    public static void main(String[] args) {

        Payment p1 =
            new CreditCardPayment("CC101");

        Payment p2 =
            new UPIPayment("UPI102");

        Payment p3 =
            new NetBankingPayment("NB103");


        p1.pay(5000);

        System.out.println("----------------");

        p2.pay(2500);

        System.out.println("----------------");

        p3.pay(7500);

        System.out.println("----------------");

        p2.refund(1000);
    }
}
