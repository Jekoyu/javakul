package Abstrak;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Manusia [] m = new Manusia[2];
    int x = 0;
    do {
        System.out.println("User ke-"+(x+1));
        System.out.print("Masukkan tinggi badan anda (cm)\t=");
        double t = Double.parseDouble(br.readLine());
        System.out.print("Masukkan Jenis Kelamin anda(L/P)\t=");
        String jk = br.readLine();

        if (jk.equalsIgnoreCase("L")) {
            m[x] = new Laki(t);
            System.out.println("Berat Badan Ideal anda adalah\t=" + m[x].HtgBBI() + " kg");
            System.out.println("====================================");
        }else {
            m[x] = new Perempuan(t);
            System.out.println("Berat Badan Ideal anda adalah\t=" + m[x].HtgBBI() + " kg");
            System.out.println("====================================");
        }
        x++;
    }while (x<2);

    }
}
