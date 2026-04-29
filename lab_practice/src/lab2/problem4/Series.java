package lab2.problem4;

public class Series extends Circuit{
    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Series(Circuit c1, Circuit c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getResistance(){
        return c1.getResistance() + c2.getResistance();
    }

    public double getPotentialDiff(){
        return potentialDifference;
    }

    public void applyPotentialDiff(double V){
        potentialDifference = V;

        double totalR = getResistance();
        double current = V / totalR;

        double v1 = current * c1.getResistance();
        double v2 = current * c2.getResistance();

        c1.applyPotentialDiff(v1);
        c2.applyPotentialDiff(v2);
    }
}
