/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan44hukumohm;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan hukum ohm
 */
public class PBO310117119Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baterai btr = new Baterai();
        Baterai ohm = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan() + " volt");

    }

}
