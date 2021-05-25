package it.nphilip.challenges.CountLetters;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr2D = {"a", "b", "a", "c", "c", "y", "2"};
        countLetters(arr2D);
    }

    public static void countLetters(String[] words) {
        int charLength = 0;
        int x = 0;

        for (String arrElement : words) {
            charLength = charLength + arrElement.length();
        }

        String[][] letterCount = new String[charLength][2];
        StringBuilder fullString = new StringBuilder();

        for (String s : words) {
            fullString.append(s);
        }

        char[] fullStringChars = fullString.toString().toCharArray();

        for (int i = 0; i <= letterCount.length - 1; i++) {
            int contains = contains(letterCount, fullStringChars[i]);
            if(contains == -1) {
                letterCount[x][0] = String.valueOf(fullStringChars[i]);
                letterCount[x][1] = "1";
                x++;
            } else {
                int num = Integer.parseInt(letterCount[contains][1]);
                letterCount[contains][1] = String.valueOf(num + 1);
            }
        }

        for (String[] arr1D : letterCount) {
            if(arr1D[0] != null && arr1D[1] != null) {
                System.out.println(Arrays.toString(arr1D));
            }
        }
    }

    public static int contains(String[][] arr2D, char word) {
        String[] arr1D = new String[arr2D.length];

        for (int i = 0; i <= arr2D.length - 1; i++) {
            arr1D[i] = arr2D[i][0];
        }

        List<String> arr1DAsList = Arrays.asList(arr1D);
        return arr1DAsList.indexOf(String.valueOf(word).toLowerCase());
    }
}
