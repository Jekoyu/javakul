package ArrayOfObject;


import java.util.Scanner;

public class AO1
{

    public static void main(String[] args)
    {

        Scanner jml = new Scanner(System.in);

        System.out.print("Masukkan jumlah obyek = ");
        int obj = jml.nextInt();

        Mahasiswa[] arr = new Mahasiswa[obj];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < obj; i++)
        {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  = ");
            int nim = s.nextInt();
            System.out.print("NAMA   = ");
            String nama = s.next();
            arr[i] = new Mahasiswa();
            arr[i].setData(nim, nama);
        }

        System.out.println("");
        for(int i = 0; i < obj ; i++)
        {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arr[i].tampil();
        }

    }
}

class Mahasiswa
{
    public int nim;
    public String nama;

    public void setData(int id, String name)
    {
        this.nim = id;
        this.nama = name;
    }

    public void tampil()
    {
        System.out.println("NIM  : " + nim );
        System.out.println("Nama : " + nama);
    }
}