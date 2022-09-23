package Payment;

public class BankPayment implements Bank{

    @Override
    public void initiatePayments() {
        //logic
        System.out.println("initiatePayments logic");
    }

    @Override
    public void status() {
        //logic
        System.out.println("status logic");
    }

    @Override
    public void getPayment() {
        //logic
        System.out.println("getPayment logic");
    }
}
