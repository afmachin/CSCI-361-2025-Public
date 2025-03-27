package assignments.stacks_and_queues.array_stack;

public class Main {
    public static void main(String[] args) {
        /*
         * Pushing
         *
         * Top: 8, Size: 1, Is Empty: false
         * Top: 4, Size: 2, Is Empty: false
         * Top: 6, Size: 3, Is Empty: false
         * Top: 1, Size: 4, Is Empty: false
         * Top: 3, Size: 5, Is Empty: false
         *
         * Popping
         *
         * Top: 3, Size: 5, Is Empty: false, Pop: 3
         * Top: 1, Size: 4, Is Empty: false, Pop: 1
         * Top: 6, Size: 3, Is Empty: false, Pop: 6
         * Top: 4, Size: 2, Is Empty: false, Pop: 4
         * Top: 8, Size: 1, Is Empty: false, Pop: 8
         *
         * 0
         * true
         */

        Stack stack = new Stack();

        System.out.println("Pushing");
        System.out.println();

        stack.push(8);
        System.out.printf("Top: %s, Size: %s, Is Empty: %s%n", stack.top(), stack.size(), stack.isEmpty());

        stack.push(4);
        System.out.printf("Top: %s, Size: %s, Is Empty: %s%n", stack.top(), stack.size(), stack.isEmpty());

        stack.push(6);
        System.out.printf("Top: %s, Size: %s, Is Empty: %s%n", stack.top(), stack.size(), stack.isEmpty());

        stack.push(1);
        System.out.printf("Top: %s, Size: %s, Is Empty: %s%n", stack.top(), stack.size(), stack.isEmpty());

        stack.push(3);
        System.out.printf("Top: %s, Size: %s, Is Empty: %s%n", stack.top(), stack.size(), stack.isEmpty());

        System.out.println();
        System.out.println("Popping");
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.printf("Top: %s, Size: %s, Is Empty: %s, Pop: %s%n", stack.top(), stack.size(), stack.isEmpty(), stack.pop());
        }

        System.out.println();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
