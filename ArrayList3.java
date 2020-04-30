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
public class ArrayList3 {
    public static void main (String[] args) {
        //membuat objek ArrayList dengan Tipe Data String
        ArrayList<String> mahasiswa = new ArrayList<>();
        
        //menambahkan data String pada objek mahasiswa
        mahasiswa.add("Wildan");
        mahasiswa.add("Ahmad");
        mahasiswa.add("Sandi");
        
        //membuat objek ArrayList dengan Tipe Data String
        ArrayList<String> mahasiswa2 = new ArrayList<>();
        
        //menambahkan data String pada objek mahasiswa2
        mahasiswa2.add("Eren");
        mahasiswa2.add("Levi");
        
        //membuat objek ArrayList dengan Tipe Data Integer
        ArrayList<Integer> nomor = new ArrayList<>();
        
        //menambahkan data Integer pada objek nomor
        nomor.add(23);
        nomor.add(53);
        nomor.add(8);
        
        //membuat objek ArrayList dengan Tipe Data Integer
        ArrayList<Integer> nomor2 = new ArrayList<>();
        
        //menambahkan data Integer pada objek nomor
        nomor.add(78);
        nomor.add(4);
        
        //menambahkan semua data pada kedua objek dengan Tipe Data yang sama
        mahasiswa.addAll(mahasiswa2);
        nomor.addAll(nomor2);
        
        //mencetak semua nilai menggunakan for-loops
        System.out.println(mahasiswa);
        System.out.println(nomor);
    }
}
