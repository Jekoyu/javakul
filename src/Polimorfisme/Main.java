package Polimorfisme;

import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws  Exception{

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        Manusia[] m = new Manusia[2];

        int x = 0;
        do {

            System.out.println("User ke-"+(x+1));
            System.out.print("Masukkan tinggi badan anda (cm)\t=");
            double t = Double.parseDouble(br.readLine());
            System.out.print("Masukkan Jenis Kelamin anda(L/P)\t=");
            String jk = br.readLine();

            if (jk.toUpperCase().equals("L")) {
                m[x] = new Laki_Laki(t);
                System.out.println("Berat Badan Ideal anda adalah\t="+m[x].HtgBBI()+" kg");
                System.out.println("====================================");
            }else if (jk.toUpperCase().equals("P")) {
                m[x] = new Perempuan(t);
                System.out.println("Berat Badan Ideal anda adalah\t="+m[x].HtgBBI()+" kg");
                System.out.println("====================================");
            }else {
                System.out.println("Jenis Kelamin yang anda masukkan salah");
                System.out.println("====================================");
            }

            x++;


        }while (x < 2);

    }
}
