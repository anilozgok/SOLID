package Payment;

public class LoanPayment implements Loan {

    @Override
    public void initiateLoanSettlement() {
        //logic
        System.out.println("intitiateLoanSettlement logic.");
    }

    @Override
    public void initiateRePayment() {
        //logic
        System.out.println("intitiateRePayment logic.");
    }

    @Override
    public void status() {
        //logic
        System.out.println("status logic.");
    }

    @Override
    public void getPayment() {
        //logic
        System.out.println("getPayment logic.");
    }
}
