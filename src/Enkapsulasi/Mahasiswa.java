package Enkapsulasi;

public class Mahasiswa {
    public static void main(String[] args) {
        Login lg = new Login();

        lg.setUsername("Andi");
        lg.setPassword("12345");

        System.out.println("Username: " + lg.getUsername());
        System.out.println("Password: " + lg.getPassword());
        System.out.println("====================================");
        Produk pr = new Produk();
        pr.setNama("Buku");
        pr.setKuantiti(10);
        pr.setDeskripsi("Buku tulis");
        pr.setHarga(10000);
        System.out.println( "Nama\t\t:"+pr.getNama());
        System.out.println("QTY\t\t\t:"+pr.getKuantiti());
        System.out.println("Deskripsi\t:"+pr.getDeskripsi());
        System.out.println("harga\t\t:"+pr.getHarga());

        pr.setNama("Pensil");
        System.out.println( "Nama\t\t:"+pr.getNama());
    }
}
