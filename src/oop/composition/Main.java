package oop.composition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setHorsePower(180);
        engine.setNumberOfCylinders(4);

        Car car = new Car();

        car.setColor("Gray");
        car.setYear(2022);
        car.setMake("Honda");
        car.setModel("CR-V");
        car.setEngine(engine);

        System.out.println(car.toString());
    }
}
