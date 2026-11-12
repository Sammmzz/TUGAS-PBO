/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP8;

/**
 *
 * @author Smsll
 */
public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;


    @Override
    protected float luas(){
     
        return panjang * lebar;
    }
    
    @Override
    protected float keliling(){
        return 2 * panjang * lebar;
    }
    
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    public float getPanjang(){
        return this.panjang;
    }
    
    public float getLebar(){
        return this.lebar;
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
