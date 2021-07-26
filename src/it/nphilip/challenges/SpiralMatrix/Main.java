package it.nphilip.challenges.SpiralMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public static void spiralOrder(int[][] arr2D) {
        int[] finalList = new int[size(arr2D)];
        int finalListIndex = 0;
        for (int[] arr : arr2D) {
            for (int i = 0; i <= arr.length - 1; i++) {
                finalList[finalListIndex] = arr[i];
                finalListIndex++;
            }
        }
        System.out.print(Arrays.toString(finalList));
    }

    public static int size(int[][] arr2D) {
        int size = 0;
        for (int[] arr : arr2D) {
            size += arr.length;
        }
        return size;
    }
}
