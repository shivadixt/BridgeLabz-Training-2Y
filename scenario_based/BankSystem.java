import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(long accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("After depositing " + String.format("%.0f", amount) + ":");
            System.out.println("Balance: " + String.format("%.0f", this.balance));
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("After withdrawing " + String.format("%.0f", amount) + ":");
            System.out.println("Balance: " + String.format("%.0f", this.balance));
        } else {
            System.out.println("Withdrawal of " + String.format("%.0f", amount) + " failed. Insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Balance: " + String.format("%.0f", this.balance));
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account details:");
        System.out.print("Account No: ");
        long accNo = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Account Holder: ");
        String holderName = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNo, holderName, balance);

        System.out.println("\nAccount Details:");
        account.displayAccountDetails();

        System.out.print("\nDeposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount1 = scanner.nextDouble();
        account.withdraw(withdrawAmount1);

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount2 = scanner.nextDouble();
        account.withdraw(withdrawAmount2);
        
        System.out.println("\nFinal Balance: " + String.format("%.0f", account.balance));

        scanner.close();
    }
}
