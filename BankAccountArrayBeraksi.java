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

import java.util.ArrayList;
public class BankAccountArrayBeraksi {
    public static void main (String[] args) {
        ArrayList<BankAccountArray> accounts = new ArrayList<BankAccountArray>();
        
        accounts.add(new BankAccountArray(1001));
        accounts.add(new BankAccountArray(1015));
        accounts.add(new BankAccountArray(1729));
        accounts.add(1, new BankAccountArray(1008));
        accounts.remove(0);
        
        System.out.println("Size: " + accounts.size());
        System.out.println("Expected: 3");
        BankAccountArray first = accounts.get(0);
        System.out.println("First account number: " + first.getAccountNumber());
        System.out.println("Expected: 1008");
        BankAccountArray last = accounts.get(accounts.size() - 1);
        System.out.println("Last account number: " + last.getAccountNumber());
        System.out.println("Expected: 1729");
    }
}
