package exams.stacks_and_queues;

public interface IStack<T> {
    public void push(T item);

    public T pop();

    public T top();

    public int size();

    public boolean isEmpty();
}
