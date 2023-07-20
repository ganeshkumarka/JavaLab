/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp11;

/**
 *
 * @author cusat
 */
public class AbstractDemo {
     public static void main(String[] args) {
        //BankAccount ob=new BankAccount()
    }
}
abstract class BankAccount{
    int account_no;
    double balance;

    public BankAccount(int account_no, double balance) {
        this.account_no = account_no;
        this.balance = balance;
    }
    
    
    
    public void deposit(double amount){
        balance += amount;
    }
    
    abstract public void withdraw(double amount);
    
}

class SavingAccount extends BankAccount{
    
    public SavingAccount(int account_no, double balance) {
        super(account_no, balance);
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance - 500 >= amount){
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
       
    }
    
    
}

class CurrentAccount extends BankAccount{
    
    public CurrentAccount(int account_no, double balance) {
        super(account_no, balance);
    }
    
    public void withdraw(double amount){
        if(balance + 1000 >= amount){
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    
    
}