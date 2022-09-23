package Service;

import Accounts.WithdrawableAccount;

public class WithdrawalService {

    private WithdrawableAccount withdrawableAccount;

    public WithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(double amount){
        this.withdrawableAccount.withdraw(amount);
    }
}
