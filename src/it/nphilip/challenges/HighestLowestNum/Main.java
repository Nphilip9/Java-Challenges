package it.nphilip.challenges.HighestLowestNum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        highestLowest("4 6 1 7 3 0");
    }

    public static void highestLowest(String numbers) {
        String[] split = numbers.split(" ");
        int[] arr = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        System.out.println(Arrays.stream(arr).sorted().toArray()[arr.length - 1]);
    }
}
