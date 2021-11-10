package it.nphilip.challenges.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Bubble sort is one of the fundamental forms of sorting in programming.
        // Bubble sort algorithms move through a sequence of data (typically integers)
        // and rearrange them into ascending or descending order one number at a time.
        // To do this, the algorithm compares number X to the adjacent number Y.
        // Worst-Case: O(n^2); Average-Case: O(n^2); Best-Case: O(n)
        int[] arr = {5, 3, 4, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int a;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i); j++) {
                if(arr[j] > arr[j + 1]) {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }
}
