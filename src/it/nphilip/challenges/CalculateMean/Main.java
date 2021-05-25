package it.nphilip.challenges.CalculateMean;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 3, 2};
        calculateMean(arr);
    }

    public static void calculateMean(int[] arr) {
        float sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sum / arr.length);
    }
}
