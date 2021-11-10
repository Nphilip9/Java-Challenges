package it.nphilip.challenges.LinearSearch;

public class Main {
    public static void main(String[] args) {
        // linear search = iterate through a collection one element at a time
        // runtime complexity: O(n)
        // Disadvantages: Slow for large data sets
        // Advantages: fast for searches of small to medium data sets
        // Does not need to sorted
        // Useful for data structures that do not have random access (Linked list)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(arr, 5));
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
