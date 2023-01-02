/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;


//mengimport Scanner ke program 
import java.util.Scanner;
/**
 *
 * @author Joankii
 */
public class DataKaryawan {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat;
        int usia, gaji;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //tampilan output ke user
        System.out.println("### Pendataan Karyawan PT ###");
        System.out.print("Nama Karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // tampilan output lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.print("Gaji:");
        gaji = keyboard.nextInt();
        
        //Menampilkan apa yang sudah di simpan di variabel
        System.out.println("===================");
        System.out.println("Nama Karyawan:" + nama);
        System.out.println("Alamat:" + alamat);
        System.out.println("Usia:" + usia);
        System.out.println("Gaji: Rp " + gaji);
        System.out.println("===================");
        
        
        // Misal, tipe datanya adalah String, maka fungsi atau method yang dipakai adalah nextLine().
        //Begitu juga dengan tipe data lain, Integer menggunakan nextInt(), Double menggunakan nextDouble(), dsb.
    
    }
    
}
