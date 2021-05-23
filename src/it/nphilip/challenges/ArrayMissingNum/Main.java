package it.nphilip.challenges.ArrayMissingNum;

public class Main {

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] missing = {1, 2, 3, 4, 6, 7, 8, 9};
        findMissingNum(expected, missing);
    }

    public static void findMissingNum(int[] expected, int[] missingArr) {
        boolean contains;
        for (int n : expected) {
            contains = false;
            for (int i = 0; i <= missingArr.length - 1; i++) {
                if (missingArr[i] == n) {
                    contains = true;
                }
            }
            if(!contains) {
                System.out.println("Found missing number: " + n);
                break;
            }
        }
    }
}
