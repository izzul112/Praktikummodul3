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
public class Penjumlahan extends Matematika {
    private int jumlah;
    private int bil1 = 3, bil2 = 4;
    
    public void jumlah()
    {
        jumlah = bil1 + bil2;
        
        System.out.println("Hasil Penjumlahan: "+jumlah);
    }
}
 