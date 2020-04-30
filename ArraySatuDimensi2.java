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
public class ArraySatuDimensi2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] angka = new int[6];
        
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan nilai array ke-" + i + ": ");
            angka[i] = input.nextInt();
        }
        
        System.out.println("");
        System.out.println("Data yang di-input ke elemen array");
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai akhir index ke-" + i + ": " + angka[i]);
        }
    }
}
