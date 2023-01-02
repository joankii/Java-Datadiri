/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;
import java.util.Scanner;
/**
 *
 * @author Joankii
 */
/*
Seperti yang kita ketahui, program komputer terdiri dari tiga komponen utama, yaitu: input, proses, dan output.

-Input: nilai yang kita masukan ke program
-Proses: langkah demi langkah yang dilakukan untuk mengelola input menjadi sesuatu yang berguna
-Output: hasil pengolahan

Java sendiri sudah menyediakan tiga class untuk mengambil input:

-Class Scanner;
-Class BufferReader;
-dan Class Console.
Tiga class tersebut untuk mengambil input pada program berbasis teks (console). Sedangkan untuk GUI menggunakan class yang lain seperti JOptionPane dan inputbox pada form.

Sementara untuk outputnya, Java menyediakan fungsi print(), println(), dan format().
*/
public class LuasSegitiga {
    public static void main(String[] args) {
        //deklarasi
        Double luas;
        int alas, tinggi;
        
        //membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();
        
        // prosess
        luas = Double.valueOf((alas * tinggi)/ 2);
        
        // output
        System.out.println("Luas = " + luas);
    
    }
}
