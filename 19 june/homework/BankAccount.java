class BankAccount {
    String customer;
    double balance;
    String accountType;

    {
        accountType = "Savings";
        System.out.println("Account Initialization Started");
    }

    BankAccount() { this("Guest", 0); }
    BankAccount(String customer) { this(customer, 0); }

    BankAccount(String customer, double balance) {
        this.customer = customer;
        this.balance = balance;
        System.out.println("Customer: " + customer);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        new BankAccount("Amit", 5000);
    }
}