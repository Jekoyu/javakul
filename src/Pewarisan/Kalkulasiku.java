package Pewarisan;

public class Kalkulasiku extends Kalkulasi{
    public void perkalian(int x,int y){
        z = x*y;
        System.out.println("Hasil : "+z);
    }

    public static void main(String[] args) {
        int a = 10,b =5;
        Kalkulasiku tes = new Kalkulasiku();
        tes.penambahan(a, b);
        tes.pengurangan(a, b);
        tes.perkalian(a, b);
    }
}
