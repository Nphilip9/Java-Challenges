package it.nphilip.challenges.CountFromTo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        count(54, 101);
    }

    public static void count(int startNum, int endNum) {
        int[] arr = new int[(endNum - startNum) + 1];
        int x = 0;
        for (int i = startNum; i <= endNum; i++) {
            arr[x] = i;
            x++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
