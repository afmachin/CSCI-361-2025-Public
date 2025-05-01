package assignments.trees_and_heaps.huffman_tree;

public class Tree implements Comparable<Tree> {
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
        System.out.print(n + " ");

        if (n.getLeft() != null) {
            _printTree(n.getLeft());
        }
        if (n.getRight() != null) {
            _printTree(n.getRight());
        }
    }

    @Override
    public String toString() {
        return String.format("[%2d:%s]", getFrequency(), getCharecter());
    }

    @Override
    public int compareTo(Tree other)	{
        if (getFrequency() > other.getFrequency()) {
            return 1;
        }
        else if (getFrequency() < other.getFrequency()) {
            return -1;
        }
        else {
            if (getCharecter() > other.getCharecter()) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
