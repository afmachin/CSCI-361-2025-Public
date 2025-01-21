package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        Cat mittens = new Cat();
        mittens.speak();

        Dog spike = new Dog();
        spike.speak();
    }
}
