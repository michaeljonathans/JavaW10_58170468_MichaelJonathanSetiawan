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
public class ArrayDuaDimensi4 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[][] angka = new int[3][2];
        
        System.out.println("Input: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                angka[i][j] = input.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("Output: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
