/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP8;

/**
 *
 * @author Smsll
 */
public class Lingkaran extends BangunDatar {
    private float jari;

    @Override
    protected float luas(){
     
        return 3.14f * jari * jari;
    }
    
    @Override
    protected float keliling(){
        return 2 * jari * 3.14f;
    }
    
    public void setJari(float jari){
        this.jari = jari;
    }
    
    public float getJari(){
        return this.jari;
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
