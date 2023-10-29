package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        double baseSpeed = Math.min(24.0, getVoltage() * getBaseSpeed());
        return (isNailed()) ? 0 : baseSpeed;
    }

    @Override
    public String getCry() {
        return  getVoltage() > 0 ? "Bzzzzzz" : "...";
    }
}
