package Constructor;
public class PBOKonstruktor
{
    String warna, merk;

    public PBOKonstruktor()
    {
        warna = "Merah";
        merk  = "BMW";
    }

    void maju()
    {
        System.out.println("Mobil " + merk + " warna " + warna +
                " bergerak maju");
    }

    void mundur()
    {
        System.out.println("Mobil " + merk + " warna " + warna + " "
                + "bergerak mundur");
    }


    public static void main(String[] args)
    {

        // Membuat object mobilSaya
        PBOKonstruktor mobilSaya = new PBOKonstruktor();

        // Memanggil object
        mobilSaya.maju();
        mobilSaya.mundur();
    }

}