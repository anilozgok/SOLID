package Payment;

public interface Bank extends Payment{

    void initiatePayments();

    @Override
    void status();

    @Override
    void getPayment();
}
