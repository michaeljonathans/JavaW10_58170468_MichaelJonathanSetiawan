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
public class ArrayList2 {
    public static void main (String[] args) {
        //membuat objek ArrayList dengan Tipe Data String
        ArrayList<String> mahasiswa = new ArrayList<>();
        
        //menambahkan data String pada objek mahasiswa
        mahasiswa.add("Wildan");
        mahasiswa.add("Ahmad");
        mahasiswa.add("Sandi");
        
        //membuat objek ArrayList dengan Tipe Data Integer
        ArrayList<Integer> nomor = new ArrayList<>();
        
        //menambahkan data Integer pada objek nomor
        nomor.add(23);
        nomor.add(53);
        nomor.add(8);
        
        //mencetak nilai satu persatu dari kedua objek ArrayList
        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.get(1));
        System.out.println(mahasiswa.get(2));
        
        System.out.println(nomor.get(0));
        System.out.println(nomor.get(1));
        System.out.println(nomor.get(2));
        //mencetak niai dari kedua objek sesuai dengan posisi Index Array
    }
}
