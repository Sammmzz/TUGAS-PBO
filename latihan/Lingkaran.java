/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Smsll
 */
public class Lingkaran extends BangunDatar {
    float r;
    
    Lingkaran(float r) {
        super.keliling = 2 * r * 3.14f;
        super.luas = 3.13f * r *r;
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}
