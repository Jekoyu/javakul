package Interface;

public class Kalkulator  implements Operasi{
    private double bil1,bil2;
    Kalkulator(){

    }
    Kalkulator(double Bil1,double Bil2){
        this.bil1 = Bil1;
        this.bil2 = Bil2;
    }
    public double getBil1(){
        return bil1;
    }
    public  double getBil2(){
        return bil2;
    }

    public void penjumlahan(){
        System.out.println(bil1+bil2);
    }
    public void pengurangan(){
        System.out.println(bil1-bil2);
    }

    @Override
    public void perkalian() {
        System.out.println(bil1*bil2);
    }
    public void pembagian(){
        System.out.println(bil1/bil2);
    }
}
