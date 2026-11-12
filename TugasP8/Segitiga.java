/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP8;

/**
 *
 * @author Smsll
 */
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    @Override
    protected float luas(){
     
        return 0.5f * alas * tinggi;
    }
    
    @Override
    protected float keliling(){
        return 3 * alas;
    }
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    
    public float getAlas(){
        return this.alas;
    }
    
    public float getTinggi(){
        return this.tinggi;
    }
    
    @Override
    void getLuas(){
        System.out.println("Luas : " + this.luas());

    }
    
    @Override
    void getKeliling(){
        System.out.println("Keliling : " + this.keliling());
    }
    
    
    
    
    
}
