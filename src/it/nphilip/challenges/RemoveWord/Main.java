package it.nphilip.challenges.RemoveWord;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'s', 't', 't', 'r', 'i', 'a', 'n', 'g', 'z'};
        removeWord(arr, "string");
    }

    public static void removeWord(char[] arr, String word) {
        for (char ch : word.toCharArray()) {
            int index = indexOf(arr, ch);
            if(index != -1) {
                arr[index] = 0;
            }
        }
        System.out.println(arr);
    }

    public static int indexOf(char[] arr, char ch) {
        String[] arrString = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrString[i] = String.valueOf(arr[i]);
        }
        List<String> arrStringList = Arrays.asList(arrString);
        return arrStringList.indexOf(String.valueOf(ch));
    }
}
