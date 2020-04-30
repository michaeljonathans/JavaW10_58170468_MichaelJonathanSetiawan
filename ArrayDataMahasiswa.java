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

import java.util.Scanner;
public class ArrayDataMahasiswa {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int data;
        int nim[] = new int [10];
        String x;
        String nama[] = new String[20];
        String jurusan[] = new String[20];
        String alamat[] = new String[20];
        
        System.out.println("                            BIODATA MAHASISWA                            ");
        System.out.println("----------------------------------Input----------------------------------");
        System.out.print("Masukkan banyak data  : ");
        data = input.nextInt();
        
        for (int i = 0; i < data; i++) {
            System.out.println("---------------Data ke-" + (i + 1) + "---------------");
            System.out.print("Masukkan NIM          : ");
            nim[i] = input.nextInt();
            x = input.nextLine();
            System.out.print("Masukkan nama         : ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan jurusan      : ");
            jurusan[i] = input.nextLine();
            System.out.print("Masukkan alamat       : ");   
            alamat[i] = input.nextLine();
            
            System.out.println("");
        }
        
        System.out.println("----------------------------------Output----------------------------------");
        System.out.println("No.      NIM          Nama Mahasiswa          Jurusan   Alamat               ");
        System.out.println("--------------------------------------------------------------------------");
        
        for (int i = 0; i < data; i++) {
            System.out.println((i+1) + "\t" + nim[i] + "\t" + nama[i] + "\t\t\t" + jurusan[i] + "\t" + alamat[i]);
            System.out.println("-------------------------------------------------------------------------");
        }
    }
}
