package Responsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Responsi.Mahasiswa.print;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Mahasiswa mhs = new Mahasiswa();
            print(0,"Data Mahasiswa Sebelum di ubah");
            print(0,"Nama Mahasiswa : "+mhs.getNAMA());
            print(0,"NIM Mahasiswa  : "+mhs.getNIM());
            mhs.datadiri();
            print(1,"\nInput Nama Baru = ");
            mhs.setNAMA(br.readLine());
            print(1,"Input NIM Baru  = ");
            mhs.setNIM(br.readLine());
            print(0,"\nNama Mahasiswa setelah di ubah : "+mhs.getNAMA());
            print(0,"NIM Mahasiswa setelah di ubah  : "+mhs.getNIM());
            mhs.datadiri();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
