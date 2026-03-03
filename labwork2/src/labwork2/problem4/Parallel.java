package labwork2.problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return 1.0 / (1.0 / c1.getResistance() + 1.0 / c2.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}