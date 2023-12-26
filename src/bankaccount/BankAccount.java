package bankaccount;

public class BankAccount {
    private final int accountNumber;
    private String accountHolderName;
    private int balance;

    BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void showInfo() {
        System.out.println("============================");
        System.out.printf("Account number: %d\n", getAccountNumber());
        System.out.printf("Owner: %s\n", getAccountHolderName());
        System.out.printf("Balance: $%d\n", getBalance());
        System.out.println("============================");
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount!");
        } else {
            balance += amount;
            System.out.printf("%d has successfully been added to %s\n", amount, accountHolderName);
            System.out.printf("Total balance: %d\n", balance);
        }
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.printf("You don't have enough money to deposit $%d!\n", amount);
        } else {
            balance -= amount;
            System.out.printf("Please take your $%d and your card\n", amount);
            System.out.printf("Total balance: %d\n", balance);
        }
    }
}
