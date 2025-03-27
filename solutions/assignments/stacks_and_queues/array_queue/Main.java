package assignments.stacks_and_queues.array_queue;

public class Main {
    /*
     * Expected output:
     *
     * Enqueue: 8
     * Queue: [8]
     * Front: 8, Size: 1, Is Empty: false
     *
     * Enqueue: 6
     * Queue: [8 <- 6]
     * Front: 8, Size: 2, Is Empty: false
     *
     * Enqueue: 3
     * Queue: [8 <- 6 <- 3]
     * Front: 8, Size: 3, Is Empty: false
     *
     * Enqueue: 5
     * Queue: [8 <- 6 <- 3 <- 5]
     * Front: 8, Size: 4, Is Empty: false
     *
     * Dequeue: 8
     * Queue: [6 <- 3 <- 5]
     * Front: 6, Size: 3, Is Empty: false
     *
     * Dequeue: 6
     * Queue: [3 <- 5]
     * Front: 3, Size: 2, Is Empty: false
     *
     * Dequeue: 3
     * Queue: [5]
     * Front: 5, Size: 1, Is Empty: false
     *
     * Dequeue: 5
     * Queue: []
     * Front: 0, Size: 0, Is Empty: true
     *
     * Dequeue: 0
     * Queue: []
     * Front: 0, Size: 0, Is Empty: true
     */
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.printf("Enqueue: %s%n", 8);
        queue.enqueue(8);
        printQueue(queue);

        System.out.printf("Enqueue: %s%n", 6);
        queue.enqueue(6);
        printQueue(queue);

        System.out.printf("Enqueue: %s%n", 3);
        queue.enqueue(3);
        printQueue(queue);

        System.out.printf("Enqueue: %s%n", 5);
        queue.enqueue(5);
        printQueue(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        printQueue(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        printQueue(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        printQueue(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        printQueue(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        printQueue(queue);
    }

    private static void printQueue(Queue queue) {
        System.out.println("Queue: " + queue);
        System.out.printf("Front: %s, Size: %s, Is Empty: %s%n%n", queue.front(), queue.size(), queue.isEmpty());
    }
}