package sets_and_maps.states.lookup;

public class Main {
    public static void main(String[] args) {
        // IStateLookup mapLookup = new IfElseStateLookup();
        // IStateLookup mapLookup = new SwitchStateLookup();
        IStateLookup mapLookup = new MapStateLookup();

        System.out.println("Looking up MA: " + mapLookup.getState("MA"));
        System.out.println("Looking up ma: " + mapLookup.getState("ma"));
        System.out.println("Looking up ME: " + mapLookup.getState("ME"));
        System.out.println("Looking up NH: " + mapLookup.getState("NH"));
        System.out.println("Looking up CT: " + mapLookup.getState("CT"));
        System.out.println("Looking up Ct: " + mapLookup.getState("Ct"));
        System.out.println("Looking up RI: " + mapLookup.getState("RI"));
        System.out.println("Looking up CA: " + mapLookup.getState("CA"));
        System.out.println("Looking up AA: " + mapLookup.getState("AA"));
    }
}
