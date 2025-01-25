package com.tit.day5javainheritence.hierarchicalinheritance.bankaccounttype;

// Creating a class BankAccountTypes to demonstrate the functionalities of the BankAccount and its subclasses
class BankAccountTypes {
    public static void main(String[] args) {
        // Creating objects for each subclass
        SavingAccount savings = new SavingAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA123", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD123", 10000.0, 12000.0);

        // Displaying account types and details
        savings.displayAccountType();
        savings.displayAccountDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayAccountDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}