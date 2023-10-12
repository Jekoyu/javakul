package Modul;

public class Handphone {
    private String merk,tipe,warna;
    private double harga;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double HargaDiskon(double dk){
        double diskon = dk * getHarga();
        return getHarga() - diskon;
    }
    public void Keterangan(){
        System.out.println("Harga HP setelah diskon 10 % : " + HargaDiskon(0.1));
    }
}
