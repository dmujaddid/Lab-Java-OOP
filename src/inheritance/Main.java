/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author eka
 */
public class Main {
    
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar oBangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi properti
        Persegi oPersegi = new Persegi();
        oPersegi.sisi = 2;
        
        // membuat objek lingkaran dan mengisi nila properti
        Lingkaran oLingkaran = new Lingkaran();
        oLingkaran.r = 7;
        
        // membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang oPersegiPanjang = new PersegiPanjang();
        oPersegiPanjang.panjang = 2;
        oPersegiPanjang.lebar = 4;
        
        // membuat objek segi tiga dan mengisi nilai properti
        Segitiga oSegitiga = new Segitiga();
        oSegitiga.alas = 5;
        oSegitiga.tinggi = 7;
        
        // memanggil method luas dan keliling
        oBangunDatar.luas();
        oBangunDatar.keliling();
        
        oPersegi.luas();
        oPersegi.keliling();
        
        oLingkaran.luas();
        oLingkaran.keliling();
                
        oPersegiPanjang.luas();
        oPersegiPanjang.keliling();
        
        oSegitiga.luas();
        oSegitiga.keliling();
        
    }
    
}
