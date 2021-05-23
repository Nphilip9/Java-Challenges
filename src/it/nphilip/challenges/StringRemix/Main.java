package it.nphilip.challenges.StringRemix;

public class Main {
    public static void main(String[] args) {
        int[] sequence = {2, 3, 1, 4, 5};
        stringRemix("Hello", sequence);
    }

    public static void stringRemix(String text, int[] sequence) {
        char[] textChars = text.toCharArray();
        char[] finalTextChars = new char[textChars.length];

        for (int i = 0; i < textChars.length; i++) {
            finalTextChars[i] = textChars[sequence[i] - 1];
        }

        System.out.println(finalTextChars);
    }
}
