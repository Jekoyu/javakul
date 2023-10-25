package Enkapsulasi;

class Kotak {
    int panjang;
    int lebar;
    int tinggi;

    int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

public class Main {
    public static void main(String[] args) {
        Kotak kotak1 = new Kotak();
        kotak1.panjang = 5;
        kotak1.lebar = 3;
        kotak1.tinggi = 2;

        int volume = kotak1.hitungVolume();
        System.out.println("Volume kotak adalah: " + volume);
    }
}