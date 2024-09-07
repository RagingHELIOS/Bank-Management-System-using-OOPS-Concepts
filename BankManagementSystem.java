import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public Account(String name, int number, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class Bank {
    private ArrayList<Account> accounts;
    private int nextAccountNumber;

    public Bank() {
        accounts = new ArrayList<>();
        nextAccountNumber = 1001;
    }

    public void openAccount(String name, double initialBalance) {
        accounts.add(new Account(name, nextAccountNumber, initialBalance));
        System.out.println("Account opened successfully. Account Number: " + nextAccountNumber);
        nextAccountNumber++;
    }

    public void depositMoney(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdrawMoney(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.display();
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBank Management System");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.openAccount(name, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accountNumberDeposit = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositMoney(accountNumberDeposit, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accountNumberWithdraw = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdrawMoney(accountNumberWithdraw, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int accountNumberDisplay = scanner.nextInt();
                    bank.displayAccount(accountNumberDisplay);
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
