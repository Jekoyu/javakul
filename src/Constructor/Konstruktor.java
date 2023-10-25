package Constructor;

public class Konstruktor
{
    private String nama;
    private String alamat;

    public Konstruktor()
    {
        nama = "Ani";
        alamat = "Jogja";
    }

    public Konstruktor(String nama)
    {
        this.nama = nama;
        alamat = "Solo";
    }

    public Konstruktor(String nama, String alamat)
    {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void cetak()
    {
        System.out.println("Nama    = " +nama);
        System.out.println("Alamat  = " +alamat);
        System.out.println(" ");
    }

    public static void main(String[] args)
    {

        Konstruktor satu = new Konstruktor();
        satu.cetak();

        Konstruktor dua = new Konstruktor("Paijo");
        dua.cetak();

        Konstruktor tiga = new Konstruktor("Siti","Jakarta");
        tiga.cetak();


    }

}