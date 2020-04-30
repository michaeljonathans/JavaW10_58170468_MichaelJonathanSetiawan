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

import java.util.*;
public class ArrayTigaDimensi {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int i, j, k;
        int [][][] data_jual;
        data_jual = new int[2][3][2];
        
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 2; k++) {
                    System.out.println("Data tahun ke- " + (i + 1));
                    System.out.println("Data ke- " + (j + 1) + " " + (k + 1));
                    System.out.print("Jumlah penjualan: ");
                    data_jual[i][j][k] = input.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("       Data Pejualan Pertahun       ");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Tahun   Hasil   Tahun Penjualan Ke- ");
        System.out.println();
        System.out.println("Ke-     Ke-     --------------------");
        System.out.println();
        System.out.println("                      1.     2.     ");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
        
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print((i + 1) + "\t");
                System.out.print((j + 1) + "\t\t");
                
                for (k = 0; k < 2; k++) {
                    System.out.print(data_jual[i][j][k]);
                    System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println();
    }
}
