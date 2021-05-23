package it.nphilip.challenges.ReverseWords;

public class Main {
    public static void main(String[] args) {
        reverseOdd("Hello my friend");

    }

    public static void reverseOdd(String phrase) {
        String[] split = phrase.split(" ");
        for (String s : split) {
            char[] wordChars = s.toCharArray();
            for (int i = wordChars.length; i > 0; i--) {
                System.out.print(wordChars[i-1]);
            }
            System.out.print(" ");
        }
    }
}
