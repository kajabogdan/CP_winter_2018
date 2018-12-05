package pl.waw.sgh.Bank;

public class CheckingAccount extends Account {
    public CheckingAccount(Integer accountID, double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public CheckingAccount(Integer accountID, double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
