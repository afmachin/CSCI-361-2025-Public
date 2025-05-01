package assignments.trees_and_heaps.huffman_tree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Huffman {
    private Tree root;
    private Map<Character, String> characterCodes;

    public Huffman() {
        characterCodes = new HashMap<Character, String>();
    }

    public void buildTreeFromFile(String filePath) throws FileNotFoundException {
        List<Tree> nodes = new ArrayList<Tree>();
        populateNodesFromFile(filePath, nodes);
        root = buildTreeFromNodes(nodes);

        buildCharacterCodes(root, "");
    }

    private void populateNodesFromFile(String filePath, List<Tree> nodes) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while (line != null) {
                String[] parts = line.split(",");
                char character = parts[0].charAt(0);

                int frequency = 0;

                try {
                    frequency = Integer.parseInt(parts[1]);
                }
                catch (NumberFormatException ex){
                    System.err.format("NumberFormatException: %s%n", ex);
                }

                nodes.add(new Tree(null, null, character, frequency));

                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }
    }

    private Tree buildTreeFromNodes(List<Tree> nodes) {
        if (nodes.size() == 1)
            return nodes.get(0);

        Collections.sort(nodes);

        Tree left = nodes.get(0);
        Tree right = nodes.get(1);
        int frequency = left.getFrequency() + right.getFrequency();
        Tree newNode = new Tree(left, right, Character.MIN_VALUE, frequency);

        if (nodes.size() == 2)
            return newNode;

        nodes.remove(1);
        nodes.remove(0);
        nodes.add(newNode);

        return buildTreeFromNodes(nodes);
    }

    private void buildCharacterCodes(Tree tree, String code) {
        if (tree.getLeft() == null && tree.getRight() == null) {
            characterCodes.put(tree.getCharecter(), code);
        } else {
            buildCharacterCodes(tree.getLeft(), code + "0");
            buildCharacterCodes(tree.getRight(), code + "1");
        }
    }

    public void printTree() {
        root.printTree();
        System.out.println();
    }

    public String getCode(char ch) {
        return characterCodes.get(ch);
    }

    public String encode(String value) {
        String result = "";

        for (char ch : value.toCharArray()) {
            result += getCode(ch);
        }

        return result;
    }

    public String decode(String code) {
        String result = "";
        Tree node = root;

        for (String ch : code.split("")) {
            if (ch.equals("0"))
                node = node.getLeft();
            else
                node = node.getRight();

            if (node.getLeft() == null && node.getRight() == null) {
                result += node.getCharecter();
                node = root;
            }
        }

        return result;
    }
}
