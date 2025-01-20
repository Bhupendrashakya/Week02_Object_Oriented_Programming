public class BankAccount { // Class to represent a bank account

    String accountHolder; // Variable to store the account holder's name
    String accountNumber; // Variable to store the account number
    double balance; // Variable to store the account balance

    // Constructor to initialize the bank account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder; // Assign the provided account holder's name to the instance variable
        this.accountNumber = accountNumber; // Assign the provided account number to the instance variable
        this.balance = balance; // Assign the provided balance to the instance variable
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Increase the balance by the deposit amount
            System.out.println("Deposited: " + amount);
            displayBalance(); // Display the updated balance
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Decrease the balance by the withdrawal amount
            System.out.println("Withdrew: " + amount);
            displayBalance(); // Display the updated balance
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to display the account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }

    // Main method to run the program
    public static void main(String args[]) {
        BankAccount account1 = new BankAccount("John Carter", "123456789", 5000); // Create a BankAccount object with specific details
        account1.displayAccountDetails(); // Display the initial account details

        account1.deposit(1500); // Deposit money into the account
        account1.withdraw(2000); // Withdraw money from the account
        account1.withdraw(5000); // Attempt to withdraw more money than available balance
    }
}
