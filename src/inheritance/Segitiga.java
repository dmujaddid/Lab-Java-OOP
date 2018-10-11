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
public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;
    
    @Override
    float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    
}
