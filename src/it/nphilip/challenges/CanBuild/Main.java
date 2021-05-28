package it.nphilip.challenges.CanBuild;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "lohles"};
        canBuild(words);
    }

    public static void canBuild(String[] words) {
        boolean contains = true;
        for (char ch : words[0].toLowerCase().toCharArray()) {
            if(!words[1].toLowerCase().contains(String.valueOf(ch))) {
                contains = false;
                break;
            }
        }
        System.out.println(words[1] + " can Build the word " + words[0] + ": " + contains);
    }
}
