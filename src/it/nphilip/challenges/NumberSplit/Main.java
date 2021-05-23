package it.nphilip.challenges.NumberSplit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        splitNum(65);
    }

    public static void splitNum(int num) {
        int[] split = new int[2];
        if(num % 2 == 0) {
            split[0] = num / 2;
            split[1] = split[0];
        } else {
            split[0] = Math.round((float) num / 2);
            split[1] = Math.round((float) num / 2) - 1;
        }
        System.out.println(Arrays.toString(split));
    }
}
