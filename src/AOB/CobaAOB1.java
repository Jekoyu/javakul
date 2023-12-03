package AOB;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import AOB.User;
public class CobaAOB1 extends Helper{
    public static void main(String[] args) {
        int a = 0;
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Buku[] arr = new Buku[10];
//        arr[0] = new Buku();
//        arr[0].setData("Seni Bodo Amat","F Kenedy","B123",12000);
//        arr[1] = new Buku();
//        arr[1].setData("Iman da Takwa","Edi Yunus","B113",123000);
        try {
        while (true){
            print(0,"===================================");
            print(0,"\t\tMenu");
            print(0,"===================================");
            print(0,"1. Liat Buku ");
            print(0,"2. Tambah Buku ");
            print(0,"3. Update Buku ");
            print(0,"4. Beli Buku ");
            print(0,"5. Keranjang");
            print(0,"6. Keluar ");
            print(1,"Masukkan Pilihan : ");
            int h = sc.nextInt();
            switch (h){
                case 1:
                    print(0,"===========================");
                    print(0,"\t\tDaftar Buku");
                    print(0,"===========================");
                    a = 0;
                    for (int i = 0 ; i < arr.length; i++) {
                        if (arr[i]!=null){
                            print(0,i+1+". "+arr[i].getData());
                        }else{
                            a++;
                        }
                        if (a == arr.length){
                            print(0,"Data Kosong!!");
                        }
                    }
                    break;
                case 2:
                    print(0,"=============================");
                    print(0,"\t\tTambah Buku");
                    print(0,"=============================");
                    int b = 0;
                    while (b<arr.length){
                        if (arr[b]==null){
                            print(1,"Judul : ");
                            String jdl = br.readLine();
                            print(1,"Author : ");
                            String ath = br.readLine();
                            print(1,"Harga : ");
                            int hg = sc.nextInt();
                            arr[b] = new Buku();
                            arr[b].setData(jdl,ath,getRandom(),hg);
                            break;
                        }
                        if (b == arr.length-1 && arr[arr.length-1] != null){
                            print(0,"Maaf Buku Telah Penuh");
                        }
                        b++;
                    }
                    break;
                case 3 :
                    print(0,"=============================");
                    print(0,"\t\tUpdate Buku");
                    print(0,"=============================");
                    print(1,"Masukkan ID Buku : \t");
                    String id = br.readLine();
                    for(int i = 0; i < arr.length; i++) {
                        if (arr[i].getId()!=null){
                            if (arr[i].getId().equals(id.toUpperCase())) {
                              print(0,(i+1)+". "+arr[i].getData());
                              break;
                            }
                        }else if(i == arr.length-1&&arr[arr.length-1]==null){
                            print(0,"Data Tidak ditemukan!");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.exit(0);

                default:
                    print(0,"Whats Wrong");
                    break;
            }

        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

