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
public class ArrayList5 {
    public static void main (String[] args) {
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        
        System.out.println("Nilai 1");
        //memasukkan data ke dalam array nilai1
        for (int i = 0; i < 5; i++) {
            nilai1.add(i);
            System.out.println("Index ke-" + i + ": " + nilai1.get(i));
        }
        
        System.out.println("Nilai 2");
        //memasukkan data ke dalam array nilai2
        for (int i = 0; i < 5; i++) {
            nilai2.add(i);
            System.out.println("Index ke-" + i + ": " + nilai2.get(i));
        }
        
        /*
            Hasil jumlah nilai1 + nilai2
            Jumlah index ke-0 : 0
            Jumlah index ke-1 : 2
            Jumlah index ke-2 : 4
            Jumlah index ke-3 : 6
            Jumlah index ke-4 : 8
        */
    }
}
