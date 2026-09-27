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
public class TahunKabisat {
     public static void main(String[] args) {
        
        int tahun;
        int hasil;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukan Tahun ( 1909 - 2024 ) : ");
        tahun = input.nextInt();
        
        
        hasil = tahun % 4;
        
        if (hasil == 0){
            System.out.println(tahun + " Adalah tahun kabisat");
        }else {
            System.out.println(tahun + " Bukan tahun kabisat");
        }
        
    }
}
