package it.nphilip.challenges.Omnipresent;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}};
        System.out.println(omnipresent(arr, 3));
    }

    private static boolean omnipresent(int[][] arr2d, int omnipresentNumber) {
        for (int[] arr2dElement : arr2d) {
            if(linearSearch(arr2dElement, omnipresentNumber) == -1) {
                return false;
            }
        }
        return true;
    }

    private static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
