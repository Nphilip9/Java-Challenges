package it.nphilip.challenges.StringPalindrome;

public class Main {
    public static void main(String[] args) {
        stringPalindrome("Anna");
    }

    public static void stringPalindrome(String text) {
        StringBuilder reverseText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText.append(text.toCharArray()[i]);
        }
        System.out.print(reverseText.toString().equalsIgnoreCase(text));
    }
}
