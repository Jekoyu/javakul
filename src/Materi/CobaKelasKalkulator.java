package Materi;

import java.util.Scanner;

class Jumlah {
    public static int jumlah(int a, int b) {
        return a + b;
    }
}
class Kali {
    public static int kali(int a, int b) {
        return a * b;
    }
}
public class CobaKelasKalkulator {
    public static void main(String[] args) {
        Jumlah jml = new Jumlah();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();
        System.out.println("1. Perkalian");
        System.out.println("2. Penjumlahan");
        System.out.print("Masukkan pilihan : ");
        int pilihan = sc.nextInt();
        if (pilihan == 1){
            int hasil = Kali.kali(a, b);
            System.out.println("Hasil : " + hasil);
        }else{
            int hasil = jml.jumlah(a, b);
            System.out.println("Hasil : " + hasil);
        }



    }
}
