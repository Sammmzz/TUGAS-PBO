/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP8;

/**
 *
 * @author Smsll
 */
public class Persegi extends BangunDatar{
    private float sisi;
    
    
    @Override
    protected float luas(){
        this.sisi = sisi * sisi;
        return sisi;
    }
    
    @Override
    protected float keliling(){
        float keliling = sisi * 4;
        return keliling;
    }
    
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi(){
        
        return sisi;
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
