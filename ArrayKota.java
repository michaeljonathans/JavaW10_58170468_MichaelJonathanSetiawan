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

public class ArrayKota {
    public static void main (String[] args) {
        String[] kota; //deklarasi variabel array
        kota = new String[3]; //membuat objek array
        
        //mengisi elemen array
        kota[0] = "Jakarta";
        kota[1] = "Surabaya";
        kota[2] = "Semarang";
        
        //menampilkan elemen array
        System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
    }
}
