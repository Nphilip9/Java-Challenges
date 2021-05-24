package it.nphilip.challenges.CountRepeat;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "Python", "Assembly", "Python", "Assembly", "Assembly", "Assembly", "Assembly", "Python", "Python"};
        countRepeat(words);
    }

    public static void countRepeat(String[] words) {
        String[][] finalListCount = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int contains = contains(finalListCount, words[i]);
            if(contains == -1) {
                finalListCount[i][0] = words[i];
                finalListCount[i][1] = "1";
            } else {
                int num = Integer.parseInt(finalListCount[contains][1]);
                finalListCount[contains][1] = String.valueOf(num + 1);
            }
        }

        for (String[] arr1D : finalListCount) {
            if(arr1D[0] != null && arr1D[1] != null) {
                System.out.println(Arrays.toString(arr1D));
            }
        }
    }

    public static int contains(String[][] arr2D, String word) {
        String[] arr1D = new String[arr2D.length];
        for (int i = 0; i <= arr2D.length - 1; i++) {
            arr1D[i] = arr2D[i][0];
        }
        List<String> arr1DAsList = Arrays.asList(arr1D);
        return arr1DAsList.indexOf(word);
    }
}
