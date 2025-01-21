package sorting_algorithms.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 6, 4, 9, 2, 3, 1 };
        System.out.println(Arrays.toString(numbers));

        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}