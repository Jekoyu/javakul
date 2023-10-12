package Modul;

import java.io.BufferedReader;

public class UtamaHandphone {
    public static void main(String[] args) throws Exception{
        Handphone hp = new Handphone();
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.print("Masukkan Merk HP : ");
        String merk_hp = br.readLine();
        System.out.print("Masukkan Tipe HP : ");
        String tipe_hp = br.readLine();
        System.out.print("Masukkan Warna HP : ");
        String warna_hp = br.readLine();
        System.out.print("Masukkan Harga HP : ");
        double harga_hp = Double.parseDouble(br.readLine());
        hp.setMerk(merk_hp);
        hp.setTipe(tipe_hp);
        hp.setWarna(warna_hp);
        hp.setHarga(harga_hp);
        System.out.println("============================================");
        System.out.printf("DAFTAR HARGA HANDPHONE");
        System.out.println("\n============================================");
        System.out.println("Merk HP : " + hp.getMerk());
        System.out.println("Tipe HP : " + hp.getTipe());
        System.out.println("Warna HP : " + hp.getWarna());
        System.out.println("Harga HP : " + hp.getHarga());
        hp.Keterangan();


    }
}
