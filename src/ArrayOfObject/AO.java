package ArrayOfObject;

import java.util.Scanner;

class Orang
{
    String nama;
    static Scanner input = new Scanner(System.in);

    public Orang(String nama)
    {
        this.nama = nama;
    }

    public static Orang[] buatarray()
    {
        System.out.print("Banyaknya object = ");
        int jml = input.nextInt();

        Orang artis[] = new Orang[jml];

        for (int i = 0 ; i < jml ; i++)
        {
            System.out.print("Masukkan nama artis ke-"+(i+1)+ " = ");
            String nama = input.next();
            artis[i] = new Orang(nama);
        }

        for (int i = 0 ; i < jml ; i++)
            System.out.println("Nama artis ke-"+(i+1)+ " = " +artis[i].nama);
        return artis;
    }

}

public class AO
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Orang org[];
        org = Orang.buatarray();
    }

}