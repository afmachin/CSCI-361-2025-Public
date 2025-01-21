package sets_and_maps.states.lookup;

import java.util.HashMap;
import java.util.Map;

public class MapStateLookup implements IStateLookup {
    private Map<String, String> stateMap;

    public MapStateLookup() {
        stateMap = new HashMap<>();

        stateMap.put("VT", "Vermont");
        stateMap.put("MA", "Massachusetts");
        stateMap.put("ME", "New Hampshire");
        stateMap.put("CT", "Connecticut");
        stateMap.put("RI", "Rhode Island");
    }

    @Override
    public String getState(String abbreviation) {
        String result = stateMap.get(abbreviation.toUpperCase());

        if (result == null)
            result = "Sorry, I only know New England states.";

        return result;
    }
}
