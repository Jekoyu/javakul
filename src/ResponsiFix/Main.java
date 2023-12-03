package ResponsiFix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static ResponsiFix.pegawai.cek;

class pegawai{
    String nama,alamat,jabatan;
    int tunjangan;
    int gajipokok;
    int masakerja;
    public static void cek(int o,String a){
        if (o==0){
            System.out.println(a);
        } else if (o==1) {
            System.out.print(a);
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public void setMasakerja(int masakerja) {
        this.masakerja = masakerja;
    }

    public int getMasakerja() {
        return masakerja;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getJabatan() {
        return jabatan;
    }
    public int getTunjangan() {
        return tunjangan;
    }
    public int getGajipokok() {
        return gajipokok;
    }
}
public class Main {
    public static String Uang(int nilai) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(localeID);
        return formatter.format(nilai);
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);

            pegawai pg = new pegawai();
            cek(1,"Masukkan nama pegawai\t\t: ");
            pg.setNama( br.readLine());
            cek(1,"Masukkan alamat pegawai\t\t: ");
            pg.setAlamat(br.readLine());
            cek(1,"Masukkan jabatan pegawai\t: ");
            pg.setJabatan(br.readLine());
            cek(1,"Lama Kerja pegawai (hari)\t: ");
            pg.setMasakerja(sc.nextInt());
            String jbt = pg.getJabatan();
            int mk = pg.getMasakerja();

            if (jbt.equalsIgnoreCase("kaprodi")){
            pg.setGajipokok(15000000);
            } else if (jbt.equalsIgnoreCase("dekan")) {
                pg.setGajipokok(20000000);
            }else if (jbt.equalsIgnoreCase("dosen")){
                pg.setGajipokok(10000000);
            }else {
                cek(0,"Maaf Jabatan tidak ada !");
            }

            if (mk<=15&&mk>=0){
                pg.setTunjangan(0);
            } else if (mk<=20) {
                pg.setTunjangan(2000000);
            } else if (mk<=25) {
                pg.setTunjangan(5000000);
            } else if (mk<=30) {
                pg.setTunjangan(10000000);
            }


            cek(0,"=====================================\n");
            cek(0,"=====================================\n");
            cek(0,"Nama \t\t\t: "+pg.getNama());
            cek(0,"Alamat\t\t\t: "+pg.getAlamat());
            cek(0,"Jabatan\t\t\t: "+pg.getJabatan().toUpperCase());
            cek(0,"=====================================\n");
            cek(0,"=====================================\n");
            cek(0,"Hari Kerja\t\t: "+pg.getMasakerja());
            cek(0,"Gaji Pokok\t\t: " +Uang(pg.getGajipokok()));
            cek(0,"Tunjangan\t\t: "+Uang(pg.getTunjangan()));
            cek(0,"-------------------------------------");
            int pt =pg.getTunjangan()+ pg.getGajipokok();
            cek(0,"Total\t\t\t: "+Uang(pt));
            cek(0,"Potongan\t\t: "+Uang(pt * 10/100));
            cek(0,"Total Diterima\t: "+Uang(pt-(pt*10/100)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
