package it.nphilip.challenges.RepeatedCharacters;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        repeatedChars("Helllooo");
    }

    public static void repeatedChars(String word) {
        char[] wordChars = word.toCharArray();
        char[] wordCharsFinalList = new char[wordChars.length];

        for (int i = 0; i < wordChars.length; i++) {
            if(!Arrays.toString(wordCharsFinalList).contains(String.valueOf(wordChars[i]))) {
                wordCharsFinalList[i] = wordChars[i];
            }
        }

        for (char ch : wordCharsFinalList) {
            if (ch != 0) {
                System.out.print(ch);
            }
        }
    }
}
