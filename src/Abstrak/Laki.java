package Abstrak;

class Laki extends Manusia{
    public Laki(double TB){
        super(TB);
    }
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.9;
    }
}
