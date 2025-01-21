package stacks_and_queues.generics;

public class PetOwner <T> {
    private T pet;

    public PetOwner(T pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "My pet is " + pet.toString();
    }
}
