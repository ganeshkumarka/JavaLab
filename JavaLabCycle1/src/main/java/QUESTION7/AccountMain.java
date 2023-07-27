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

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balanceAmount = scanner.nextDouble();

        System.out.print("Choose account type (1 - Saving Account, 2 - Current Account): ");
        int accountType = scanner.nextInt();

        Account account;
        if (accountType == 1) {
            account = new SavingAccount(accountHolderName, accountNumber, balanceAmount);
        } else if (accountType == 2) {
            account = new CurrentAccount(accountHolderName, accountNumber, balanceAmount);
        } else {
            System.out.println("Invalid account type. Exiting the program.");
            return;
        }

        int choice;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Deposit cash");
            System.out.println("2. Withdraw funds");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                   account.withdrawal(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}

