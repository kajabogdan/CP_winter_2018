package pl.waw.sgh.Bank;

public class SavingAccount extends Account {
    public SavingAccount(Integer accountID, double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public SavingAccount(Integer accountID, double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
