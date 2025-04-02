package exams.stacks_and_queues;

import java.util.LinkedList;

public class StackLL<T extends Comparable<T>> implements IStack<T> {
    private LinkedList<T> items;

    public StackLL() {
        items = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        items.addFirst(item); // addFirst is the equivalent to append
    }

    @Override
    public T pop() {
        return items.poll(); // poll is the equivalent to removeHead
    }

    @Override
    public T top() {
        return items.peek(); // peek is the equivalent to getHead
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String toString() {
        // Added to help debug your program, feel free to change if you see fit
        if (items.isEmpty()) {
            return "empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("top %s", items.get(0)));

        for (int i = 1; i < items.size(); i++) {
            sb.append(String.format(" -> %s", items.get(i)));
        }

        return sb.toString();
    }
}
