package Payment;

public interface Loan extends Payment{

    void initiateLoanSettlement();

    void initiateRePayment();

    @Override
    void status();

    @Override
    void getPayment();
}
