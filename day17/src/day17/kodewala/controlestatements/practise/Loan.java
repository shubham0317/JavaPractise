package day17.kodewala.controlestatements.practise;

public class Loan {

    public int calculateProcessingFee(int loanAmount) {
        int processingFee = 0;

        if (loanAmount <= 0) {
            return -1;
        } else if (loanAmount < 100000) {
            processingFee = 500;
        } else if (loanAmount <= 499999) {
        	System.out.println(" Processing fees will be 1% of loanAmount");
            processingFee = loanAmount / 100;
        } else if (loanAmount <= 999999) {
        	System.out.println(" Processing fees will be 0.75% of loanAmount");
            processingFee = (int) (loanAmount * 75L / 10000);
        } else {
        	System.out.println(" Processing fees will be 0.50% of loanAmount");
            processingFee = loanAmount / 200;
        }

        // Apply maximum processing fee cap
        if (processingFee > 10000) {
            processingFee = 10000;
        }

        return processingFee;
    }
}