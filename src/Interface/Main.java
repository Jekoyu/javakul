package Interface;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Kalkulator k = new Kalkulator();
        System.out.print("Masukkan Bilangan pertama\t: ");
        double p = Double.parseDouble(br.readLine());
        System.out.print("Masukkan Bilangan kedua\t: ");
        double q = Double.parseDouble(br.readLine());

        k = new Kalkulator(p,q);

        System.out.println("=====================");

        System.out.print("Hasil Penjumlahan\t: ");
        k.penjumlahan();

        System.out.print("\nHasil Pengurangan\t: ");
        k.pengurangan();

        System.out.print("\nHasil Perkalian\t: ");
        k.perkalian();

        System.out.print("\nHasil Pembagian\t: ");
        k.pembagian();

    }
}
