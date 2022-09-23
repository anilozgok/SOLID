package Accounts;

import Abstract.Account;

public class FixedTermDepositAccount extends Account {

    private double balance;

    public FixedTermDepositAccount(double balance) {
        this.balance = balance;
    }

    public FixedTermDepositAccount(){
        this.deposit(0);
    }

    @Override
    protected void deposit(double amount) {
        this.balance+=balance;

    }

    @Override
    protected double getBalance() {
        return this.balance;
    }


}
