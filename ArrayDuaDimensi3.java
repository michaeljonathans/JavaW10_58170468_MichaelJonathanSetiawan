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

public class ArrayDuaDimensi3 {
    public static void main (String[] args) {
        int i, j;
        int[][] nil_akhir = {{150, 159, 230}, {100, 125, 150}, {210, 125, 156}};
        
        System.out.println("Data yang di-input ke elemen array\n");
        
        //menampilkan data dari elemen array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Nilai akhir index ["+i+"]["+j+"]: ");
                System.out.println(" : " + nil_akhir[i][j]);
            }
        }
    }
}
