package it.nphilip.challenges.SumsUp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, -2, 5, -10, -11, -4};
        sumsUp(arr, 8);
    }

    private static void sumsUp(int[] arr, int num) {
        int[][] sumsUp = new int[arr.length][2];
        int i = 0;
        for (int element1 : arr) {
            for (int element2 : arr) {
                if(element1 == num) {
                    sumsUp[i][0] = num;
                } else if(element1 + element2 == num) {
                    sumsUp[i][0] = element1;
                    sumsUp[i][1] = element2;
                }
            }
            i++;
        }
        for (int[] ints : sumsUp) {
            if (ints[0] != 0 || ints[1] != 0) {
                System.out.println(Arrays.toString(ints));
            }
        }
    }
}
