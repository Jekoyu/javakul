package Kalkulator;

import Pilihan.Persegi;
import Pilihan.PersegiPanjang;
import Pilihan.Segitiga;

import java.util.Scanner;
import Pilihan.Lingkaran;
import Pilihan.Segitiga;
import Pilihan.PersegiPanjang;
import Pilihan.Persegi;

public class PenghitungLuas {
    public static void main(String[] args) {
        double Hasil;
        Scanner sc = new Scanner(System.in);


        int pilihan = 1;
        do {
            System.out.println("1. Pilihan.Persegi");
            System.out.println("2. Pilihan.Persegi Panjang");
            System.out.println("3. Pilihan.Segitiga");
            System.out.println("4. Pilihan.Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
             pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan sisi : ");
                int sisi = sc.nextInt();
                Persegi pg = new Persegi();
                Hasil = pg.Hitung(sisi);
                System.out.println("Hasil : " + Hasil);
            } else if (pilihan ==2) {
                System.out.print("Masukkan Panjang : ");
                int a = sc.nextInt();
                System.out.print("Masukkan Lebar : ");
                int b = sc.nextInt();
                PersegiPanjang pj = new PersegiPanjang();
                Hasil = pj.Hitung(a, b);
                System.out.println("Hasil : " + Hasil);
            }else if (pilihan==3){
                System.out.print("Masukkan alas : ");
                int a = sc.nextInt();
                System.out.print("Masukkan tinggi : ");
                int t = sc.nextInt();
                Segitiga sg = new Segitiga();
                Hasil = sg.Hitung(a, t);
                System.out.println("Hasil : " + Hasil);
            } else if (pilihan==4 ) {
                System.out.print("Masukkan jari-jari : ");
                int r = sc.nextInt();
                Lingkaran lk = new Lingkaran();
                Hasil = lk.Hitung(r);
                System.out.println("Hasil : " + Hasil);
            }else if (pilihan==5){
                System.out.println("Terima Kasih");
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
            System.out.println();
        } while (pilihan != 5);


    }
}