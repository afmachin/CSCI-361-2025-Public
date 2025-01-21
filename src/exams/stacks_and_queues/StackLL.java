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
}
