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

public class ArrayTigaDimensi2 {
    public static void main (String[] args) {
        int i, j, k;
        int [][][] data_jual = {
            {{100, 200, 300}, {150, 240, 340}, 
             {250, 340, 460}, {250, 340, 460}},
            {{160, 250, 365}, {175, 275, 375},
             {275, 375, 575}, {380, 480, 580}}
        };
        
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
