package AOB;

public class Buku {
    String judul,author,id;
    int harga;
    public void setData(String judul,String author,String id,int harga){
        this.judul = judul;
        this.harga = harga;
        this.id = id;
        this.author = author;
    }

    public String getJudul() {
        return judul;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public int getHarga() {
        return harga;
    }

    public String getData(){
        return getId()+"\t "+getJudul()+"\t "+getAuthor()+"\t "+getHarga();
    }


}
