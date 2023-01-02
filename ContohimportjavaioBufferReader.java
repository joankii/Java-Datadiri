/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Joankii
 */
public class ContohimportjavaioBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        //Mengisi variabel nama dengan bufferreader
        System.out.print("Input nama: ");
        nama = br.readLine();
        
        
        //tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        
        /*
        Ternyata class BufferReader tidak bisa bekerja sendirian. Dia juga butuh teman yaitu: class InputStreamReader dan class IOException.
        */
    }

    
    }
       
