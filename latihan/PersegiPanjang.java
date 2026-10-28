/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Smsll
 */
public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    PersegiPanjang (float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
        this.luas = panjang * lebar;
        this.keliling = 2 * panjang * lebar;
        
        System.out.println("Luas : " + this.luas);
        System.out.println("Keliling : " + this.keliling);
    }
}
