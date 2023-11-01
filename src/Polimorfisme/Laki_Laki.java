package Polimorfisme;

public class Laki_Laki extends Manusia{
    public Laki_Laki(double TB){
        super(TB);
    }
    public double HtgBBI(){
        return (super.getTinggiBadan()-100)*0.9;
    }
}
