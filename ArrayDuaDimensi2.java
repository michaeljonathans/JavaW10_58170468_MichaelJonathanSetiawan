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
public class ArrayDuaDimensi2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int i, j;
        int[][] data_jual;
        data_jual = new int[3][3];
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Masukkan data jual ke-["+i+"]["+j+"]: ");
                data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("\n\nData jual yang di-input ke elemen array\n");
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
               System.out.print("Nilai data jual ["+i+"]["+j+"]");
               System.out.println(" : " + data_jual[i][j]);
            }
            System.out.println();
        }
    }
}
