package pl.waw.sgh.Bank;

public class PlayWithBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = bank.newCustomer("John", "Brown", "john@brown.com");
        Customer c2 = bank.newCustomer("Anna", "Smith", "annasmith@vp.pl");

        Account a1 = bank.newAccount(c1, "Debit");
        Account a2 = bank.newAccount(c1, "Savings");
        Account a3 = bank.newAccount(c1, "");

        Account a4 = bank.newAccount(c2, "Debit");
        a4.deposit(60.0);
        a3.charge(30.0);
        Account a5 = bank.newAccount(c2, "Savings");
        System.out.println(bank);

    }
}
