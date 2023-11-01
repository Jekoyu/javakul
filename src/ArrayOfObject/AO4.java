package ArrayOfObject;
import java.util.Scanner;
class Student
{
    private String nama;
    private int nim;

    public void setDetails(String n, int m)
    {
        nama = n;
        nim = m;
    }

    public void printDetails()
    {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }
}

public class AO4
{
    public static void main(String[] args)
    {
        // declaring array of objects
        Student[] st = new Student[3];

        // initializing array
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  = ");
            String nama = s.next();
            System.out.print("NIM   = ");
            int nim = s.nextInt();

            st[i] = new Student();
            st[i].setDetails(nama, nim);
        }

        // printing details of the objects
        for (int i = 0; i < 3; i++) {
            st[i].printDetails();
        }
    }

}