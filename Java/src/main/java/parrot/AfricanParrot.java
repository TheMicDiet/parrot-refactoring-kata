package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        double loadFactor = 9.0;
        return Math.max(0, getBaseSpeed() - loadFactor * getNumberOfCoconuts());
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
