package assignments.trees_and_heaps.huffman_tree;

public class Tree implements Comparable {
    private Tree left;
    private Tree right;
    private char charecter;
    private int frequency;

    public Tree(Tree left, Tree right, char charecter, int frequency) {
        this.left = left;
        this.right = right;
        this.charecter = charecter;
        this.frequency = frequency;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public int getFrequency() {
        return frequency;
    }

    public char getCharecter() {
        return charecter;
    }

    public void printTree() {
        _printTree(this);
    }

    public void _printTree(Tree n) {
        // add code here to print the tree
        // using a preorder traversal...
    }

    @Override
    public String toString() {
        return String.format("%s (%2d)", getCharecter(), getFrequency());
    }

    @Override
    public int compareTo(Tree other) {
        // add code here to ensure that the natural ordering
        // sorts trees in ascending order based on the tree's frequency,
        // in the case of a tie sort in ascending order
        // based on the tree's letter...
    }
}
