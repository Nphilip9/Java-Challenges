package it.nphilip.challenges.FindOdd;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 8};
        findOdd(arr);
    }

    public static void findOdd(int[] arr) {
        for (int element : arr) {
            if(element % 2 != 1) {
                System.out.println(element + " is a Odd number");
            }
        }
    }
}
