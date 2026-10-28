/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJava3;

/**
 *
 * @author Smsll
 */
public class Lingkaran {
    double jariJari;
    
    Lingkaran(double jariJari){
        if(jariJari <= 0){
            this.jariJari = 1.0;
        }else {
            this.jariJari = jariJari;
        }
    }
    
    void hitungLuas(){
        double luas = jariJari * jariJari * 3.14;
        System.out.println("Luas : " + luas);
    }
}
