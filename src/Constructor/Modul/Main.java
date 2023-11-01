package Constructor.Modul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Login usr = new Login();
        Login usr2 = new Login("","");

        while (true){
            System.out.println("=======================");
            System.out.println("\tMENU LOGIN");
            System.out.println("=======================");
            System.out.println("1. Login admin");
            System.out.println("2. Ubah Password admin");
            System.out.println("3. Buat User");
            System.out.println("4. Lihat data User");
            System.out.println("5. Keluar");
            System.out.println("=======================");
            System.out.print("Pilih menu: ");
            int pilih = Integer.parseInt(br.readLine());
            switch (pilih){
                case 1:
                    System.out.print("Masukkan username: ");
                    String username = br.readLine();
                    System.out.print("Masukkan password: ");
                    String password = br.readLine();
                    if (username.equals(usr.getUsername()) && password.equals(usr.getPassword())){
                        System.out.println("Login berhasil");
                    }else {
                        System.out.println("Login gagal");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan password lama: ");
                    String oldPass = br.readLine();
                    System.out.print("Masukkan password baru: ");
                    String new_Pass = br.readLine();
                    System.out.println();
                    if (oldPass.equals(usr.getPassword())){
                        usr.setPassword(new_Pass);
                        System.out.println("Password berhasil diubah");
                      }else {
                        System.out.println("Password gagal diubah");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan username: ");
                    String create_User = br.readLine();
                    System.out.print("Masukkan password: ");
                    String create_Pass = br.readLine();

                    usr2.setUsername(create_User);
                    usr2.setPassword(create_Pass);
                    System.out.println();
                    System.out.println("User berhasil dibuat");
                    break;
                case 4:
System.out.println("Username: "+usr2.getUsername());
                    System.out.println("Password: "+usr2.getPassword());
                    break;

case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
        }


    }
}
}
