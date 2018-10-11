/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author eka
 */
public class Player {
    
    //defini stribut
    String name;
    int speed;
    int healthPoint;
    
    // definisi method run
    void run() {
        System.out.println(name + " is Running");
        System.out.println("Speed : " + speed);
    }
    
    // definisi method isDead untuk mengecek nilai kesehatan (healthPoint)
    boolean isDead() {
        if (healthPoint <= 0) return true;
        return false;
    }
}
