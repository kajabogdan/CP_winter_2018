package pl.waw.sgh.Bank;

import java.math.BigDecimal;

public class Account {

    private Integer accountID;

    private BigDecimal balance;

    private String currency = "USD";

    private Customer customer;

    public Account(Integer accountID, double balance, String currency, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.currency = currency;
        this.customer = customer;
    }

    public Account(Integer accountID, double balance, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.customer = customer;
    }

    public void deposit(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void charge(Double amount) {
        balance = balance.subtract(BigDecimal.valueOf(amount));
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                .replace("Acc{", "") + "{" +
                "ID=" + accountID +
                "," + currency + "=" + balance +
                ", cust" + customer.getCustomerID() +
                '}';
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;


    }
}
