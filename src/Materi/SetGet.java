package Materi;

class Mahasiswa{
    private String nama;
    private String nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
public class SetGet {
    public static void main(String[] args) {
        //membuat objek dari Class
        Mahasiswa andri = new Mahasiswa();
        //mengisi nilai atribut
        andri.setNama("Andri");
        andri.setNim("1234567890");

        //menampilkan data
        System.out.println("Nama : " + andri.getNama());
        System.out.println("NIM : " + andri.getNim());
    }
}
