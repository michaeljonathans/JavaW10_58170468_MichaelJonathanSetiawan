/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 * Michael Jonathan Setiawan 58170468
 */
import java.util.Scanner;

public class ArrayPelangganListrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data;
        String[] kode = new String[50]; 
        String x;
        String[] nama = new String[20];
        String[] alamat = new String[100];
        String tanya = "";

        do {
            System.out.print("Masukkan banyak data  : ");
            data = input.nextInt();
            x = input.nextLine();
            
            for (int i = 0; i < data; i++) {
                System.out.println("---------------Data ke-" + (i + 1) + "---------------");
                System.out.print("Kode pelanggan        : ");
                kode[i] = input.nextLine();
                System.out.print("Nama pelanggan        : ");
                nama[i] = input.nextLine();
                System.out.print("Alamat pelanggan      : ");
                alamat[i] = input.nextLine();

                System.out.println("");
            }

            System.out.println("                     DATA PELANGGAN PT. SENTOSA JAYA                     ");
            System.out.println("               Jl. Sagu No. 27A Kebagusan, Jakarta Selatan               ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("No.   Kode pelanggan          Nama pelanggan           Alamat            ");
            System.out.println("-------------------------------------------------------------------------");
            
            for (int i = 0; i < data; i++) {
                System.out.println((i+1) + "\t" + kode[i] + "\t\t\t" + nama[i] + "\t\t\t" + alamat[i]);
                System.out.println("-------------------------------------------------------------------------");
            }
            System.out.print("Mau input data lagi?");
            tanya = input.nextLine();
        } while (tanya.equals("Ya") || tanya.equals("ya"));
    }
}
