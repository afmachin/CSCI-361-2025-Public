package sorting_algorithms.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 6, 4, 9, 2, 3, 1 };
        System.out.println(Arrays.toString(numbers));

        SelectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}