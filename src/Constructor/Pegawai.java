package Constructor;
class Pegawai{
    int id;
    String nama;

    Pegawai(int x, String y) {
        id = x;
        nama = y;
    }

    Pegawai(Pegawai p) {
        id = p.id;
        nama =p.nama;
    }
    void view() {
        System.out.println(id+" "+nama);
    }

    public static void main(String[] args){
        Pegawai p1 = new Pegawai(31, "Gumi");
        Pegawai p2 = new Pegawai(p1);

        p1.view();
        p2.view();
    }
}
