package it.nphilip.challenges.ReverseCase;

public class Main {
    public static void main(String[] args) {
        reverseCase("Hello World");
    }

    public static void reverseCase(String text) {
        char[] textToChar = text.toCharArray();
        for (int i = 0; i < textToChar.length; i++) {
            if (Character.isUpperCase(textToChar[i])) {
                textToChar[i] = Character.toLowerCase(textToChar[i]);
            } else {
                textToChar[i] = Character.toUpperCase(textToChar[i]);
            }
        }
        System.out.println(textToChar);
    }
}
