package Accounts.WithdrawableAccounts;

import Accounts.WithdrawableAccount;

public class CurrentAccount extends WithdrawableAccount {

    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public CurrentAccount() {
        this.deposit(0);
    }

    @Override
    protected void deposit(double amount) {
        this.balance+=amount;
        System.out.println(amount+" deposited. Current balance "+this.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        this.balance-=amount;
        System.out.println(amount+" withdrawn. Current balance "+this.getBalance());
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
