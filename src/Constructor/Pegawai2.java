package Constructor;
class Pegawai2{
    int id;
    String nama;

    Pegawai2(int x, String y) {
        id = x;
        nama = y;
    }

    Pegawai2() {

    }
    void view() {
        System.out.println(id+" "+nama);
    }

    public static void main(String args[]){
        Pegawai2 p1 = new Pegawai2(31, "Gumi");
        Pegawai2 p2 = new Pegawai2();
        p2.id = p1.id;
        p2.nama = p1.nama;

        p1.view();
        p2.view();
    }
}