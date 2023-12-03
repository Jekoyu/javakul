package Responsi;

public class Mahasiswa {
    String NAMA,NIM;

    public static void print(int a,String s){
        if (a==0){
            System.out.println(s);
        } else if (a ==1) {
            System.out.print(s);
        }
    }
    public Mahasiswa(String NAMA, String NIM) {
        this.NAMA = NAMA;
        this.NIM = NIM;
    }
    public Mahasiswa(){
       NAMA = "Joko Yuliyanto";
       NIM = "5220311100";
    }
    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public void datadiri(){
       print(0,"Nama saya "+getNAMA()+", saya mahasiswa dengan NIM "+getNIM());
    }
}
