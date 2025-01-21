package sets_and_maps.words;

public class Main {
    public static void main(String[] args) {
        UniqueWords words = new UniqueWords();
        words.processFile(args[0]);
        words.printWords();
    }
}
