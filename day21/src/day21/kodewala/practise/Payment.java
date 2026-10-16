package day21.kodewala.practise;

abstract class Payment {

	 final void receipt() {
	        System.out.println("Receipt generated");
	    }

	  abstract void pay();
	
}

class UPI extends Payment {

    void pay() {
        System.out.println("UPI payment");
    }

//    void receipt() {
//        System.out.println("UPI receipt");
//    }
}
