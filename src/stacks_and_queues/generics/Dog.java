package stacks_and_queues.generics;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "a Dog named " + name;
    }
}
