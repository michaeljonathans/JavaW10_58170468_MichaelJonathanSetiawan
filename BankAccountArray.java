/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 * Michael Jonathan Setiawan
 * 58170468
 */

public class BankAccountArray {
    private double balance;
    private int accountNumber;
    
    public BankAccountArray (int accountNumber) {
        balance = 0;
        this.accountNumber = accountNumber;
    }
    
    public void deposit (double amount) {
        balance = balance + amount;
    }
    
    public void withdraw (double amount) {
        balance = balance - amount;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
}
