# Bank Management System using OOPS Concepts

A simple and interactive console-based Bank Management System implemented in Java, demonstrating the principles of Object-Oriented Programming (OOP) such as encapsulation, inheritance, and abstraction. 

## Features
- **Open Account**: Create a new bank account with an initial balance.
- **Deposit Money**: Add money to an existing account.
- **Withdraw Money**: Withdraw money from an existing account, provided sufficient balance is available.
- **Display Account Details**: View details of a specific account including the account holder's name, account number, and balance.

## Classes and Methods
### **Account Class**
- Represents individual bank accounts.
- **Attributes**: `accountHolderName`, `accountNumber`, `balance`.
- **Methods**:
  - `deposit(double amount)`: Deposits a specified amount into the account.
  - `withdraw(double amount)`: Withdraws a specified amount if sufficient balance is available.
  - `display()`: Displays account details.
  - `getAccountNumber()`: Returns the account number.

### **Bank Class**
- Manages multiple accounts.
- **Attributes**: 
  - `accounts`: A list of `Account` objects.
  - `nextAccountNumber`: Tracks the next account number to assign.
- **Methods**:
  - `openAccount(String name, double initialBalance)`: Creates a new account.
  - `depositMoney(int accountNumber, double amount)`: Deposits money into a specified account.
  - `withdrawMoney(int accountNumber, double amount)`: Withdraws money from a specified account.
  - `displayAccount(int accountNumber)`: Displays the details of a specified account.

### **BankManagementSystem Class**
- The main class that provides a console-based menu for interacting with the Bank and Account classes.
- Implements a user-friendly interface with options to:
  - Open a new account.
  - Deposit money.
  - Withdraw money.
  - Display account details.
  - Exit the application.

## Usage
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Bank-Management-System.git
   cd Bank-Management-System
2. Compile the Java file:
   ```bash
   Copy code
   javac BankManagementSystem.java
3. Run the program:
   ```bash
   Copy code
   java BankManagementSystem

## Sample Menu
Bank Management System
  1. Open Account
  2. Deposit Money
  3. Withdraw Money
  4. Display Account
  5. Exit
  Enter your choice:

## Concepts Demonstrated
  Encapsulation: Private fields and public getter/setter methods ensure controlled access to class attributes.
  Abstraction: The Bank class abstracts the details of managing multiple accounts.
  ArrayList: Used to dynamically store and manage a list of accounts.
  Scanner: Used for user input.

## Requirements
Java Development Kit (JDK) 8 or higher.

## Future Enhancements
Add support for multiple account types (e.g., savings, current).
Include transaction history for each account.
Implement user authentication for secure access.
Add support for file-based or database storage.
