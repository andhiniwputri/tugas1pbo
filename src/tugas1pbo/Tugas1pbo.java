/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author Acer
 */
public class Tugas1pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kelastugas1pbo limasSegitiga = new kelastugas1pbo();
        kelastugas1pbo sisi = new kelastugas1pbo();
        kelastugas1pbo rusuk = new kelastugas1pbo();
        kelastugas1pbo volume = new kelastugas1pbo();
        kelastugas1pbo alas = new kelastugas1pbo();
        
        limasSegitiga.bangunRuang = "Limas Segitiga";
        limasSegitiga.banyakSisi = "4";
        limasSegitiga.banyakRusuk = "6";
        limasSegitiga.rumusAlas = "1/3 * luas alas * tingg";
        limasSegitiga.rumusVolume = "1/2 * alas segitiga * tinggi segitiga";
        
        
        sisi.banyakSisi = "Banyak sisi = 4";
        rusuk.banyakRusuk = "Banyak rusuk = 6";
        volume.rumusVolume = "1/3 * luas alas * tinggi";
        alas.rumusAlas = "1/2 * alas segitiga * tinggi segitiga";
    
        System.out.println(limasSegitiga.bangunRuang);
        System.out.println(sisi.banyakSisi);
        System.out.println(rusuk.banyakRusuk);
        System.out.println(volume.rumusVolume);
        System.out.println(alas.rumusAlas);
    }
}
    

