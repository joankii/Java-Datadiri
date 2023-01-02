/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;
/* Macam-macam Tipe Data
Berikut ini macam-macam tipe data pada Java:

- char: Tipe data karakter, contoh Z
- int: angka atau bilangan bulat, contoh 29
- float: bilangan desimal, contoh 2.1
- double: bilangan desimal juga, tapi lebih besar kapasistanya, contoh 2.1
- String: kumpulan dari karakter yang membentuk teks, contoh Hello World!
- boolean: tipe data yang hanya bernilai true dan false
*/

  
  import java.util.Scanner; //<- 2. Impor library
/**
 *
 * @author Joankii
 */
public class Testprogram {
int namaVariabel;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){ //<- 4. Method main
        System.out.println("Hello World");
        System.out.println("");
        System.out.println("");
        int namaVariabel = 19;
        int a, b, c;
        
        // blok program if
    if( true ){
            System.out.println(true);
    }

    // blok program for
    for ( int i = 0; i<10; i++){
        System.out.println("Perulangan ke"+i);
    }
    }
}
