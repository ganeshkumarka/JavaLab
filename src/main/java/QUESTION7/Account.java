/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION7;

/**
 *
 * @author cusat
 */
import java.util.Scanner;
abstract class Account {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balanceAmount;

    public Account(String accountHolderName, String accountNumber, double balanceAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public void deposit(double amount) {
        balanceAmount += amount;
        System.out.println("Amount deposited successfully. New balance: " + balanceAmount);
    }

    public abstract void withdrawal(double amount);
}
class SavingAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000;

    public SavingAccount(String accountHolderName, String accountNumber, double balanceAmount) {
        super(accountHolderName, accountNumber, balanceAmount);
    }

    @Override
    public void withdrawal(double amount) {
        if (balanceAmount - amount >= MINIMUM_BALANCE) {
            balanceAmount -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balanceAmount);
        } else {
            System.out.println("Insufficient balance. Minimum balance of " + MINIMUM_BALANCE + " should be maintained.");
        }
    }
}

class CurrentAccount extends Account {
    private static final double OVERDRAFT_PERCENTAGE = 0.05;

    public CurrentAccount(String accountHolderName, String accountNumber, double balanceAmount) {
        super(accountHolderName, accountNumber, balanceAmount);
    }

    @Override
    public void withdrawal(double amount) {
        double overdraftAmount = balanceAmount * OVERDRAFT_PERCENTAGE;
        if (balanceAmount - amount >= -overdraftAmount) {
            balanceAmount -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balanceAmount);
        } else {
            System.out.println("Insufficient balance. Overdraft limit: " + overdraftAmount);
        }
    }
}
