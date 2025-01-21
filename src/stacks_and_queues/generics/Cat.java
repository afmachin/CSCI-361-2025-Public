package stacks_and_queues.generics;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "a Cat named " + name;
    }
}