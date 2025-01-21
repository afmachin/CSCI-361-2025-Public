package sets_and_maps.states.uniquify;

public class Main {
    public static void main(String[] args) {
        UniqueStates states = new UniqueStates();

        states.addState("MA");
        states.addState("NJ");
        states.addState("VA");
        states.addState("NJ");
        states.addState("MA");
        states.addState("CT");
        states.addState("CT");

        System.out.println(states);
    }
}
