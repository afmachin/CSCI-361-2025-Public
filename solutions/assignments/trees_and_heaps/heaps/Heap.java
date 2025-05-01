package assignments.trees_and_heaps.heaps;

import java.util.List;
import java.util.ArrayList;

public class Heap implements IHeap {
    private List<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public Heap(List<Integer> list) {
        heap = new ArrayList<>(list);
        heapify(heap);
    }

    @Override
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    @Override
    public int remove() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);

        return max;
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public int peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        return heap.get(0);
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    private void heapify(List<Integer> list) {
        for (int i = list.size() / 2 - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    public void heapifyDown(int index) {
        int left = getLeftChildIndex(index);
        int right = getRightChildIndex(index);
        int largest = index;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void heapifyUp(int index) {
        int current = index;
        int parent = getParentIndex(index);

        while (current > 0 && heap.get(current) > heap.get(parent)) {
            swap(current, parent);
            current = parent;
            parent = getParentIndex(current);
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }
}
