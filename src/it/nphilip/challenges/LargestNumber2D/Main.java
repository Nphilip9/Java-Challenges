package it.nphilip.challenges.LargestNumber2D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{3, 8, 1}, {69, 32, 100}, {32, 34, 11}};
        largestNumber(matrix);
    }

    public static void largestNumber(int[][] matrix) {
        int[] largestNumber = new int[matrix.length];
        int i = 0;
        for (int[] array : matrix) {
            int[] arrSorted = Arrays.stream(array).sorted().toArray();
            largestNumber[i] = arrSorted[arrSorted.length - 1];
            i++;
        }
        System.out.println(Arrays.toString(largestNumber));
    }
}
