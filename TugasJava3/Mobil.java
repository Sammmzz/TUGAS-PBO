/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJava3;

/**
 *
 * @author Smsll
 */
public class Mobil {
    String merek;
    String model;
    int tahun;
    
    Mobil(String merek, String model){
        this.merek = merek;
        this.model = model;
        this.tahun = 2025;
    }
    
    Mobil(String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    
    void informasi(){
        System.out.println("=== Informasi ===");
        System.out.println("Merek Mobil : " + merek);
        System.out.println("Model Mobil : " + model);
        System.out.println("Tahun Mobil : " + tahun);
    }
    
    
    
    
}
