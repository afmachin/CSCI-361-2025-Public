package labs.sets_and_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Plates {
    private Map<String, Integer> plateMap;
    private Set<String> validStates;

    public Plates() {
        plateMap = new HashMap<>();
        validStates = new HashSet<>(Arrays.asList("CT", "MA", "ME", "NY", "RI", "VT"));
    }

    public void buildMap(String filePath) {
        // Implement me...
    }

    public void printCounts() {
        System.out.println("Number of Plates: " + plateMap.keySet().size());

        for (Map.Entry<String, Integer> entry : plateMap.entrySet())
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
    }
}