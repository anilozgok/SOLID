package Accounts.WithdrawableAccounts;

import Accounts.WithdrawableAccount;

public class SavingsAccount extends WithdrawableAccount {

    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public SavingsAccount() {
        this.deposit(0);
    }

    @Override
    protected void deposit(double amount) {
        this.balance+=amount;
        System.out.println(amount +" deposited to the account. Current balance "+this.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        this.balance-=amount;
        System.out.println(amount+" withdrawn. Current balance "+this.getBalance());
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
