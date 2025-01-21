package oop.composition;

public class Engine {
    private int horsePower;
    private int numberOfCylinders;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return getNumberOfCylinders() + " cylinder " + getHorsePower() + " hp engine";
    }
}