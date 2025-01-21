package sets_and_maps.states.uniquify;

import java.util.HashSet;
import java.util.Set;

public class UniqueStates {
    private Set<String> states;

    public UniqueStates() {
        states = new HashSet<>();
    }

    public void addState(String state) {
        states.add(state);
    }

    public void clearStates() {
        states.clear();
    }

    @Override
    public String toString() {
        return states.toString();
    }
}
