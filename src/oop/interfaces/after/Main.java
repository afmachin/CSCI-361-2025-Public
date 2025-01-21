package oop.interfaces.after;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }

    public void go() {
        List<IShape> shapes = new ArrayList<IShape>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Square(5));
        shapes.add(new Triangle(4, 5, 6));

        for(IShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " perimeter: " + shape.getPerimeter());
        }
    }
}
