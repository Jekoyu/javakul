package ArrayOfObject;


import java.util.Scanner;

public class AO3
{
    String npm,nama;
    double uts,uas,na;
    Scanner getdata=new Scanner(System.in);

    public void setdata()
    {
        System.out.print("Masukkan Nama      : ");
        this.nama=getdata.nextLine();
        System.out.print("Masukkan NPM       : ");
        this.npm=getdata.nextLine();
        System.out.print("Masukkan Nilai UTS : ");
        this.uts=getdata.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        this.uas=getdata.nextDouble();
        this.na=(this.uts+this.uas)/2;
    }

    public String getnpm()
    {
        return this.npm;
    }

    public void tampil()
    {
        System.out.println("Nama        : "+this.nama);
        System.out.println("NPM         : "+this.npm);
        System.out.println("Nilai UTS   : "+this.uts);
        System.out.println("Nilai UAS   : "+this.uas);
        System.out.println("Nilai Akhir : "+this.na);
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner getint=new Scanner(System.in);
        int a,z=0,menu=0,ketemu;
        String npm;
        AO3[] mhs=new AO3[128];
        Scanner getdata=new Scanner(System.in);
        while(menu!=4)
        {
            System.out.print("Menu...\n1.input\n2.view\n3.search\n4.exit\npilihan : ");
            menu=getint.nextInt();
            if(menu==1)
            {
                z++;
                mhs[z]=new AO3();
                mhs[z].setdata();
            }
            else if(menu==2)
            {
                if(z<1)
                {
                    System.out.println("Data Masih Kosong");
                }
                else
                {
                    a=0;
                    while(a<z)
                    {
                        a++;
                        System.out.println("---"+a+"---");
                        mhs[a].tampil();
                    }
                }
            }
            else if(menu==3)
            {
                if(z<1)
                {
                    System.out.println("Data Masih Kosong");
                }
                else
                {
                    System.out.print("Masukkan npm yang dicari : ");
                    npm=getdata.nextLine();
                    a=0;
                    ketemu=0;
                    while(a<z)
                    {
                        a++;
                        if(npm.equals(mhs[a].getnpm()))
                        {
                            mhs[a].tampil();
                            ketemu++;
                        }
                    }
                    if(ketemu<1)
                        System.out.println("Data Yang Anda Cari Mungkin Tidak Ada");
                }
            }
            else if(menu==4)
            {
                System.out.println("Keluar...");
            }
            else
            {
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }
    }
}
