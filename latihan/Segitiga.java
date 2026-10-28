/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Smsll
 */
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    
    Segitiga (float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        super.luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga : " + this.luas);
    }
    
}
