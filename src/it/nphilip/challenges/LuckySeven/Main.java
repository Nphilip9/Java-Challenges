package it.nphilip.challenges.LuckySeven;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        System.out.println(luckySeven(arr));
    }

    private static boolean luckySeven(int[] arr) {
        for (int k : arr) {
            for (int i : arr) {
                System.out.println(k + " " + i);
                if (k == 7) {
                    return true;
                } else if (k == i) {
                    // Ignore
                    System.out.println("Skip");
                } else if (k + i == 7) {
                    return true;
                }
            }
        }
        return false;
    }
}
