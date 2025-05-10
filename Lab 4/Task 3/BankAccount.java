public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Insufficient amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000, "acc1");
        account1.deposit(500);
        account1.checkBalance();
        account1.withdraw(500);
        account1.checkBalance();

        BankAccount account2 = new BankAccount(500, "acc2");
        account2.deposit(1500);
        account2.checkBalance();
        account2.withdraw(3000);
    }
}