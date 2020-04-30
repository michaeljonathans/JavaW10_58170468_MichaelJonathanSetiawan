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

public class ArrayDuaDimensi {
    public static void main (String[] args) {
        String [][] kata = new String[2][2];
        
        kata[0][0] = "Halo";
        kata[0][1] = "Apa kabar";
        kata[1][0] = "Selamat siang";
        kata[1][1] = "Hai";
        
        System.out.println(kata[1][1] + " " + kata[0][1]);
    }
}
