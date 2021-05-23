package it.nphilip.challenges.ReverseNum;

public class Main {
    public static void main(String[] args) {
        reverseNum(5425);
    }

    public static void reverseNum(int num) {
        char[] numCharArr = String.valueOf(num).toCharArray();
        for (int i = numCharArr.length - 1; i > -1; i--) {
            System.out.print(numCharArr[i]);
        }
    }
}
