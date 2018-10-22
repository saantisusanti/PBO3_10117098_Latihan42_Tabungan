/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan42_tabungan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Mengambil uang dari saldo yang diinputkan oleh user dan 
 *                     menampilkan jumlah saldo setelah melakukan penarikan
 */
public class PBO3_10117098_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        int p;

        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal \t : ");
        Tabungan tabung = new Tabungan(scn1.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        p = scn1.nextInt();
        System.out.println("Saldo Anda Sekarang \t : "+tabung.ambilUang(p));
    }
    
}
