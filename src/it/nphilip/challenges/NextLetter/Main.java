package it.nphilip.challenges.NextLetter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        nextLetter("hello", "abcdefghijklmnopqrstuvwxyz");
    }

    public static void nextLetter(String text, String abc) {
        int x = 0;
        char[] finalWord = new char[text.length()];
        for (char ch : text.toCharArray()) {
            int index = indexOf(abc.toCharArray(), ch);
            if(index != -1) {
                finalWord[x] = abc.toCharArray()[index + 1];
                x++;
            }
        }
        System.out.println(finalWord);
    }

    public static int indexOf(char[] arr, char ch) {
        String[] charArrString = new String[arr.length];
        for (int i = 0; i < charArrString.length; i++) {
            charArrString[i] = String.valueOf(arr[i]);
        }
        List<String> stringAsList = Arrays.asList(charArrString);
        return stringAsList.indexOf(String.valueOf(ch));
    }
}
