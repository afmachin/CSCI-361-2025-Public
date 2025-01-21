package assignments.trees_and_heaps.heaps;

import java.util.List;
import java.util.Arrays;

/*
* Expected output:
* Heap: [9, 5, 2, 3]
*
* Heap size: 4
*
* Max (removed): 9
* Heap size: 3
* New Heap: [5, 3, 2]
*
* Max (removed): 5
* Heap size: 2
* New Heap: [3, 2]
*
* Max (removed): 3
* Heap size: 1
* New Heap: [2]
*
* Max (removed): 2
* Heap size: 0
* New Heap: []
*
* Heap: [9, 5, 2, 3]
* Peek: 9
* Heap: []
*/
public class Main {
    public static void main(String[] args) {
        Integer[] ary = { 2, 5, 9, 3 };
        List<Integer> items = Arrays.asList(ary);

        IHeap heap = new Heap(items);
        /*
         * heap is set to [2, 5, 9, 3]
         * 2
         * / \
         * 5 9
         * /
         * 3
         *
         * We use our formula floor(size / 2) - 1to find the index of the first non-leaf
         * node (starting
         * from the end of the heap). In this case, the index is 1.
         *
         * We then call heapifyDown on the index 1 node. This will have no impact on the
         * heap as 5 is larger
         * than 3. Resulting in: [2, 5, 9, 3]
         * 2
         * / \
         * 5 9
         * /
         * 3
         *
         * We then call heapifyDown on the index 0 node. This will swap 9 and 2
         * resulting in [9, 5, 2, 3]
         * 9
         * / \
         * 5 2
         * /
         * 3
         *
         */
        System.out.println("Heap: " + heap); // Expected outpus: Heap: [9, 5, 2, 3]

        /*
         * What happens in this loop?...
         * Starting Heap [9, 5, 2, 3]
         * 9
         * / \
         * 5 2
         * /
         * 3
         *
         * Iteration 1:
         * 9 is removed and the last node (3) is moved to the root resulting in [3, 5,
         * 2]
         * 3
         * / \
         * 5 2
         * reheapDown is called resulting in [5, 3, 2]
         * 5
         * / \
         * 3 2
         *
         *
         * Iteration 2:
         * 5 is removed and the last node (2) is moved to the root resulting in [2, 3]
         * 2
         * /
         * 3
         * reheapDown is called resulting in the [3, 2]
         * 3
         * /
         * 2
         *
         * Iteration 3:
         * 3 is removed and the last node (2) is moved to the root resulting in [2]
         * 2
         * reheapDown is called resulting in the heap:
         * 2
         *
         * Iteration 4:
         * 2 (the last node of the heap) is removed.
         * With the tree being empty, reheapDown does nothing.
         *
         */
        System.out.println("\nHeap size: " + heap.size() + "\n");
        while (heap.size() > 0) {
            /*
             * Expected output of the loop:
             * Heap size: 4
             *
             * Max (removed): 9
             * Heap size: 3
             * New Heap: [5, 3, 2]
             *
             * Max (removed): 5
             * Heap size: 2
             * New Heap: [3, 2]
             *
             * Max (removed): 3
             * Heap size: 1
             * New Heap: [2]
             *
             * Max (removed): 2
             * Heap size: 0
             * New Heap: []
             *
             */
            System.out.println("Max (removed): " + heap.remove());
            System.out.println("Heap size: " + heap.size());
            System.out.println("New Heap: " + heap.toString() + "\n");
        }

        heap = new Heap(items);
        System.out.println("Heap: " + heap); // Expected output: Heap: [9, 5, 2, 3]
        System.out.println("Peek: " + heap.peek()); // Expected output: Peek: 9

        heap = new Heap();
        System.out.println("Heap: " + heap); // Expected output: Heap: []
    }
}