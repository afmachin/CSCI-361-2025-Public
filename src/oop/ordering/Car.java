package oop.ordering;

public class Car implements Comparable<Car> {
    private String make;
    private int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car() {
        this("", 0);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car other) {
        if(getYear() > other.getYear())
            // 1 means this is "greater than" other.
            return 1;
        else if(getYear() < other.getYear())
            // -1 means this is "less than" other.
            return -1;
        else
            // 0 means this and other are the same (for ordering).
            return 0;
    }

    @Override
    public String toString() {
        return String.format("<Make: %s, Year: %s>", getMake(), getYear());
    }
}
