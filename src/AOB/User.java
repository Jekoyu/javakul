package AOB;

public class User extends Helper{
    private String username,passsowrd,nama;
    public void setData(String username,String passsowrd,String nama){
        this.username = username;
        this.passsowrd = passsowrd;
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPasssowrd() {
        return passsowrd;
    }

    public String getNama() {
        return nama;
    }

    public boolean validasi_login(String username,String passsowrd){
        if (username == getUsername()){
            if (passsowrd == getPasssowrd()){
                return true;
            }
            print(0,"Password anda salah");
            return false;
        }
        print(0,"Username Salah");
        return false;
    }
}
