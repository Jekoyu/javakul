package Materi;

class Mobil{
    String Warna;
    int Tahun;

    void isidata(String warna, int tahun){
        this.Warna = warna;
        this.Tahun = tahun;
    }
}
public class CobaKelas1 {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.isidata("Biru", 2011);

        System.out.println("Warna Materi.Mobil : " + mobilku.Warna);
        System.out.println("Tahun Materi.Mobil : " + mobilku.Tahun);
    }
}
