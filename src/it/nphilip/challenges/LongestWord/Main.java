package it.nphilip.challenges.LongestWord;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"hallo", "Moin", "Hi", "Hey"};
        longestWord(words);
    }

    public static void longestWord(String[] words) {
        int[] arr = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            char[] wordsChars = words[i].toCharArray();
            arr[i] = wordsChars.length;
        }
        int longestWordLength = Arrays.stream(arr).sorted().toArray()[arr.length - 1];
        for (String word : words) {
            if(word.toCharArray().length == longestWordLength) {
                System.out.println(word + " is the longest string");
            }
        }
    }
}
