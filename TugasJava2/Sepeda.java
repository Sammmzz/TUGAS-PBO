/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJava2;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */
class Sepeda {
    int jarak_tempuh;
    String merk;
    int opsi;
    
    void melaju() {
        jarak_tempuh += 10;
        System.out.println("Bergerak maju 10 Km");
    }
    
    void mundur() {
        jarak_tempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
    }
    
    void berhenti(){
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", jarak tempuh akhir " + jarak_tempuh + " Km");
    }
    
    void information(){
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarak_tempuh + " Km");
    }
    
    void menu(){
        do{
            System.out.println("Menu : ");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Opsi : ");
            opsi = input.nextInt();
            
            System.out.println("");
            
            if(opsi == 1){
                melaju();
                information();
            }else if (opsi == 2){
                mundur();
                information();
            }else if (opsi == 3){
                berhenti();
            }else if(opsi == 0){
                System.out.println("Keluar Program ..");
                System.out.println("Terimakasih sudah menggunakan program ini");
            }else {
                System.out.println("Menu Tidak Valid!");
            }
            System.out.println("");
            
        }while(opsi != 0);
        
    }
}
