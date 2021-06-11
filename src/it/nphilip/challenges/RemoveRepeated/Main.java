package it.nphilip.challenges.RemoveRepeated;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        removeRepeated("Helllllooooooooo");
    }

    public static void removeRepeated(String text) {
        char[] textCharList = new char[text.length()];
        int index = 0;

        for (char ch : text.toCharArray()) {
            if(!arrContains(textCharList, ch)) {
                textCharList[index] = ch;
                index++;
            }
        }

        for (int i = 0; i < textCharList.length; i++) {
            if(textCharList[i] != 0) {
                System.out.print(textCharList[i]);
            }
        }
    }

    public static boolean arrContains(char[] arr, char ch) {
        String[] arrString = new String[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            arrString[i] = String.valueOf(arr[i]);
        }
        List<String> arrStringAsList = Arrays.asList(arrString);
        return arrStringAsList.contains(String.valueOf(ch));
    }
}
