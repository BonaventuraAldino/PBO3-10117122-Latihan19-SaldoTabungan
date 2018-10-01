/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan19.saldotabungan;
import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukan jumlah tabungan awal, bunga, dan lama men-
 *                     abung, menampilkan jumlah tabungan setiap bulan
 * 
 */
public class PBO310117122Latihan19SaldoTabungan {

    static int saldoAkhir;
    static void hitung (int a,int b){
        saldoAkhir = (a + (a*b/100));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int bulan, lamaMenabung, saldoAwal, bunga;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo Awal = Rp ");
        saldoAwal = scanner.nextInt();

        System.out.print("Masukkan Bunga (dalam %) =  ");
        bunga = scanner.nextInt();

        System.out.print("Masukkan Lama Menabung (dalam bulan) = ");
        bulan = scanner.nextInt();

        for (lamaMenabung = 1; lamaMenabung <= bulan; lamaMenabung++) {
            hitung(saldoAwal, bunga);
            
            System.out.println("Saldo di Bulan ke-" + lamaMenabung);
            System.out.println("Bunga = " + bunga + "% perbulan, "
                    + "bunga yang anda dapat = " + saldoAwal*bunga/100);
            System.out.println("Saldo Akhir Anda Adalah = " + saldoAkhir);
            System.out.println("----------------------------------------------"
                    + "------------------");
            saldoAwal = saldoAkhir;
        }
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
