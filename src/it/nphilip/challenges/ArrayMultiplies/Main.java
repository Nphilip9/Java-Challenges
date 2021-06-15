package it.nphilip.challenges.ArrayMultiplies;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        arrayMultiplied(7, 9);
    }

    public static void arrayMultiplied(int multiplier, int range) {
        int[] arr = new int[range];
        for (int i = 0; i <= range - 1; i++) {
            arr[i] = multiplier * i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
