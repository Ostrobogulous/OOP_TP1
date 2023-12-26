package bankaccount;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to our mindblowing Bank!");
        BankAccount account1 = new BankAccount(735897, "Sheldon Cooper", 224000);
        account1.showInfo();
        account1.deposit(5500);
        account1.showInfo();
        account1.withdraw(150000);
        account1.withdraw(12000);
        account1.withdraw(120000);
        account1.showInfo();
    }
}
