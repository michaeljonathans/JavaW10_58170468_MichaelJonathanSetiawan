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

import java.util.Scanner;
public class ArraySatuDimensi3 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        String[] buah = new String[5];
        
        for (int i = 0; i < buah.length; i++) {
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = input.nextLine();
        }
        
        System.out.println("--------------------");
        
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }
    }
}
