package oop.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        Car honda = new Car("Honda", 2012);
        cars.add(honda);

        Car audi = new Car("Audi", 2009);
        cars.add(audi);

        Car ford = new Car("Ford", 2021);
        cars.add(ford);

        System.out.println(cars);
        // [<Make: Honda, Year: 2012>, <Make: Audi, Year: 2009>, <Make: Ford, Year: 2021>]

        // Using sort with our class that implements comparator:
        Collections.sort(cars);
        System.out.println(cars);
        // [<Make: Audi, Year: 2009>, <Make: Honda, Year: 2012>, <Make: Ford, Year: 2021>]

        // Using an anonymous class to define sorting on the fly:
        Collections.sort(cars,
            new Comparator<Car>() {
                @Override
                public int compare(Car carA, Car carB) {
                    int comparison = carA.getMake().compareTo(carB.getMake());

                    // Sort by name descending.
                    if(comparison < 0)
                        // carA is less than carB.
                        // but since we want descending order we return 1 so that carA is placed before carB.
                        return 1;
                    else if(comparison > 0)
                        // carA is greater than carB.
                        // but since we want descending order we return 1 so that carA is placed after carB.
                        return -1;
                    else
                        // carA is the same as carB.
                        return 0;
                }
            }
        );
        System.out.println(cars);
        // [<Make: Honda, Year: 2012>, <Make: Ford, Year: 2021>, <Make: Audi, Year: 2009>]

        // Using a lamba to define sorting on the fly:
        Collections.sort(cars,
            (Car carA, Car carB) -> {
                int comparison = carA.getMake().compareTo(carB.getMake());

                // Sort by name ascending.
                if (comparison < 0)
                    // carA is less than personB.
                    return -1;
                else if (comparison > 0)
                    // carA is greater than personB.
                    return 1;
                else
                    // personA is the same as personB.
                    return 0;
            }
        );
        System.out.println(cars);
        // [<Make: Audi, Year: 2009>, <Make: Ford, Year: 2021>, <Make: Honda, Year: 2012>]
    }
}
