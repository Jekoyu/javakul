package Polimorfisme;

public class Perempuan extends Manusia{
    public Perempuan(double TB){
        super(TB);
    }
    public double HtgBBI(){
        return (super.getTinggiBadan()-100)*0.8;
    }
}
