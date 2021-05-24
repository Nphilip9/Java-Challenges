package it.nphilip.challenges.CountPositiveNegative;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {32, 12, -12, 0, -18, 10000, -1231241, -111111, -132};
        count(arr);
    }

    public static void count(int[] arr) {
        int[] positiveNegative = {0, 0};
        for (int element : arr) {
            if(element >= 0) {
                positiveNegative[0] += 1;
            } else {
                positiveNegative[1] += 1;
            }
        }
        System.out.println(Arrays.toString(arr) +
                "\nQuantity of positive numbers: " + positiveNegative[0] +
                "\nQuantity of negative numbers: " + positiveNegative[1]);
    }
}
