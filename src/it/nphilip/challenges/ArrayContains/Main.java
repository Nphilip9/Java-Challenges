package it.nphilip.challenges.ArrayContains;


public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        containsN(arr, 7);
    }

    public static void containsN(int[] arr, int n) {
        boolean contains = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] == n) {
                contains = true;
                System.out.println("Boom");
            }
        }
        if(!contains) {
            System.out.println("Array doesn't contain " + n);
        }
    }
}
