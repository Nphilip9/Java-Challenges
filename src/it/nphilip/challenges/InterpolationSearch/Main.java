package it.nphilip.challenges.InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        // ONLY USE ON SORTED LISTS
        // interpolation search = improvement over binary search best used for "uniformly" distributed data
        // "guesses" where a value might be based on calculated probe results
        // if probe is incorrect, search area is narrowed, and a new probe is calculated
        // Time complexity: average case: O(log(log(n))); worst case: O(n) [value increases exponentially]
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(interpolationSearch(array, 4));
    }

    public static int interpolationSearch(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;

        while(value >= arr[low] && value <= arr[high] && low <= high) {
            int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            System.out.println("Probe: " + probe);
            if(arr[probe] == value) {
                return probe;
            } else if(arr[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
