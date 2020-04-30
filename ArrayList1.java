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
public class ArrayList1 {
    public static void main (String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        
        //memasukkan data ke dalam Array
        for (int i = 0; i < 5; i++) {
            data.add("Data " + (i + 1));
        }
        
        //menampilkan data
        for (int i = 0; i < 5; i++) {
            System.out.println(data.get(1)); //data 1
        }
    }
}
