package Accounts;

import Abstract.Account;

public class WithdrawableAccount extends Account {

    private double balance;

    public WithdrawableAccount() {
        this.deposit(0);
    }

    public WithdrawableAccount(double balance) {
        this.balance = balance;
    }

    @Override
    protected void deposit(double amount) {
        this.balance+=amount;
        System.out.println(amount +" deposited to the account. Current balance "+this.getBalance());
    }
    @Override
    protected double getBalance() {
        return this.balance;
    }
    public void withdraw(double amount){
        this.balance-=amount;
        System.out.println(amount+" withdrawn. Current balance "+this.getBalance());
    }


}
