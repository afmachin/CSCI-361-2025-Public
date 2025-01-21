package stacks_and_queues.generics;

public class Main {
    public static void main(String[] args) {
        Cat mittens = new Cat("Mittens");
        PetOwner<Cat> tony = new PetOwner<>(mittens);
        System.out.println(tony.toString());

        Dog spike = new Dog("Spike");
        PetOwner<Dog> jen = new PetOwner<>(spike);
        System.out.println(jen.toString());
    }
}
