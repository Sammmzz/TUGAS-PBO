/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjava;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */
public class Lingkaran {
    public static void main (String[] args) {
        float jari, keliling, luas;
        float Pi = 3.14f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Jari Jari : ");
        jari = input.nextFloat();
        
        luas = Pi * ( jari * jari );
        keliling = 2 * Pi * jari;
        
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
        
        
    }
}
