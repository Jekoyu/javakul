package Modul;
class Mobilku{
    private int merk;
    private String nama,warna;

    public void masuk_info(int merk, String nama, String warna){
        this.merk = merk;
        this.nama = nama;
        this.warna = warna;
    }

    public void info(){
        System.out.println("No\t\t: " + merk);
        System.out.println("Nama\t: " + nama);
    }
}
public class TugasBAB3 {
    public static void main(String[] args) {
        Mobilku mobil1 = new Mobilku();
        Mobilku mobil2 = new Mobilku();

        mobil1.masuk_info(1, "Avanza","Hitam");
        mobil2.masuk_info(2, "Xenia","Putih");

        mobil1.info();
        mobil2.info();
    }
}
