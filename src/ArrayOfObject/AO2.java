package ArrayOfObject;
public class AO2
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Mobil mbl[] = {
                new Mobil("Toyota", "Kijang"),
                new Mobil("Honda", "Brio"),
                new Mobil("Wuling", "Pregio"),
                new Mobil("Hyundai", "Elf")
        };

        for(Mobil mb: mbl)
            mb.cetak();
    }
}

class Mobil {
    public String Merk;
    public String Nama;

    public Mobil(String mrk, String nm) {
        this.Merk = mrk;
        this.Nama = nm;
    }

    public void cetak() {
        System.out.println(Merk+" - "+Nama);
    }
}
