package Constructor;

public class Mobil {
    String nama;
    String merk;

    public Mobil()
    {
        nama = "Toyota";
        merk = "Innova";
    }

    void cetak()
    {
        System.out.println("Mobil saya merk " +merk);
        System.out.println("Produksi dari " +nama);
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        Mobil mbl = new Mobil();
        mbl.cetak();
    }
}
