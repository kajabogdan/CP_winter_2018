package pl.waw.sgh.Bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {
    public DebitAccount(Integer accountID, double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public DebitAccount(Integer accountID, double balance, Customer customer) {
        super(accountID, balance, customer);
    }

}
