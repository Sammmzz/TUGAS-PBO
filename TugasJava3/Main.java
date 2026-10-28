/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJava3;

/**
 *
 * @author Smsll
 */
public class Main {
    public static void main(String[] args) {
        // TUGAS 1 BUKU
//        Buku buku1 = new Buku("Anak Remaja","Anatasya",2025);
//        buku1.informasi();

    // TUGAS 2 MOBIL
    Mobil mobil1 = new Mobil("Toyota","Kijang Kapsul");
    Mobil mobil2 = new Mobil("Honda","Civic", 2022);

    mobil1.informasi();
    mobil2.informasi();
    
    // Tugas 3 Lingkaran
    Lingkaran lngkrn = new Lingkaran(20);
    lngkrn.hitungLuas();

    }
    
}
