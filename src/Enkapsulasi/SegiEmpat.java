package Enkapsulasi;

import java.util.Scanner;

public class SegiEmpat {
    private int panjang,lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int Luas(){
        return getPanjang() * getLebar();
    }

    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        se.setPanjang(sc.nextInt());
        System.out.print("Masukkan Lebar : ");
        se.setLebar(sc.nextInt());
        System.out.println("Luas Segi Empat : " + se.Luas());


    }
}
