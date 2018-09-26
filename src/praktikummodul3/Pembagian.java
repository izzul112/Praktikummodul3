/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul3;

/**
 *
 * @author User
 */
public class Pembagian extends Matematika {
     private int jumlah;
    private int bil1 = 10, bil2 = 2;
    
    void pembagian ()
    {
        jumlah = bil1 / bil2;
        System.out.println("Hasil Pembagian: "+jumlah);
    }
}
