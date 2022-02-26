package it.nphilip.challenges.LuckySeven;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        System.out.println(luckySeven(arr, 7));
    }

    private static boolean luckySeven(int[] arr, int num) {
        for (int k : arr) {
            for (int i : arr) {
                System.out.println(k + " " + i);
                if (k == num) {
                    return true;
                } else if (k == i) {
                    // Ignore
                    System.out.println("Skip");
                } else if (k + i == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
