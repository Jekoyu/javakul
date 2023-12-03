package PewarisanKelas;
// super kelas untuk kelas anak : Sapi, Kucing, Anjing
class Mamalia{
    int ID;
    String Nama;
    String Keterangan;
    //konstruktor
    public Mamalia (int id, String nama, String keterangan) {
        ID = id;
        Nama = nama;
        Keterangan = keterangan;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID = " +ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
    }
}

//kelas Sapi
//Turunan dari kelas Mamalia, menggunakan "extends" dan "super"
class Sapi extends Mamalia {
    String Jenis;
    //konstruktor
    public Sapi (int mID, String nama, String keterangan, String jenis) {
        super (mID, nama, keterangan);
        Jenis = jenis;
    }


    //methode
    @Override
    public void TampilkanRincian() {
        System.out.println("ID = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis = " + Jenis);
    }
}

//kelas Kucing
//Turunan dari kelas Mamalia, menggunakan "extends" dan "super"
class Kucing extends Mamalia {
    String Jenis;
    //konstruktor
    public Kucing (int mID, String nama, String keterangan, String jenis) {
        super (mID, nama, keterangan);
        Jenis = jenis;
    }
    //methode
    @Override
    public void TampilkanRincian() {
        System.out.println("ID = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis = " + Jenis);
    }
}

//kelas Angora
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class Angora extends Kucing {
    String Jenis;
    //konstruktor
    public Angora (int kID, String nama, String keterangan, String jenis) {
        super (kID, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    @Override
    public void TampilkanRincian() {
        System.out.println("ID = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis = " + Jenis);
    }
}

//kelas Persia
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class Persia extends Kucing {
    String Jenis;
    //konstruktor
    public Persia (int kID, String nama, String keterangan, String jenis) {
        super (kID, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    @Override
    public void TampilkanRincian() {
        System.out.println("ID = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis = " + Jenis);
    }
}

//kelas Tiffany
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class Tiffany extends Kucing {
    String Jenis;
    //konstruktor
    public Tiffany (int kID, String nama, String keterangan, String jenis) {
        super (kID, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    @Override
    public void TampilkanRincian() {
        System.out.println("ID = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis = " + Jenis);
    }
    class Hewan {

        public void suaraHewan() {
            System.out.println("Hewan bersuara");
        }
    }

    class Tikus extends Hewan {

        @Override
        public void suaraHewan() {
            System.out.println("Tikus bersuara : cit cit");
        }
    }

    class Kucing extends Hewan {

        @Override
        public void suaraHewan() {
            System.out.println("Kucing bersuara : weong");
        }
    }
}