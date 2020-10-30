/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan22.perhitunganlingkaran;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan lingkaran
 **/

import java.util.Scanner;
public class PBOIF210119084Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static double jari(double diameter){
        double jari = diameter/2;
        return jari;
    }
    
    public static double luas(double diameter){
        double jari = jari(diameter);
        double luas =  3.14*jari*jari;
        return luas;
    }
    
    public static double keliling(double diameter){
        double jari = jari(diameter);
        double keliling = 2 * 3.14 * jari;
        return keliling;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filterAngka;
        boolean kondisi=true;
        
        double diameter = 0;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = input.nextLine();
            if(filterAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while (!kondisi);
        
        System.out.println("======Hasil Perhitungan Lingkaran");
        System.out.println("jari-jari Lingkaran : " + jari(diameter));
        System.out.println("Luas lingkaran  : " + luas(diameter));
        System.out.println("Keliling Lingkaran : " + keliling(diameter));
        
        System.out.println("===============================================");
       System.out.println("Developed by Muhammad Idris Merdefi");
        
        
        
        
    }
    
}
