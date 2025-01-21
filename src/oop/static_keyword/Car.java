package oop.static_keyword;

public class Car {
    public static int numberOfCars;
    private String make;
    private String model;

    public Car(String make, String model) {
        setMake(make);
        setModel(model);

        numberOfCars++;
        System.out.println(String.format("New %s %s. There are currently %s cars.", getMake(), getModel(), numberOfCars));
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
