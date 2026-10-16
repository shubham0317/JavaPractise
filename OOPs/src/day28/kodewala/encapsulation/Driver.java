package day28.kodewala.encapsulation;

public class Driver {
    public static void main(String[] args) {
    	Payment p1 = new Payment(1000);
    	p1.doCredit(1000);
    	System.out.println(" Your Updated balance is: "+ p1.getBalance());
    	p1.doDebit(500);
    	System.out.println(" Your Updated balance is: "+ p1.getBalance());
    }
}
