package it.nphilip.challenges.PerfectSquarePatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        perfectSquare(5);
    }

    public static void perfectSquare(int n) {
        int[][] arr2D = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2D[i][j] = n;
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
    }
}
