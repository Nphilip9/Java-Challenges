package it.nphilip.challenges.HistogramFunction;

public class Main {
    public static void main(String[] args) {
        int[] lengths = {2, 5, 1, 6};
        histogramFunction(lengths, '#');
    }

    public static void histogramFunction(int[] lengths, char ch) {
        for (int length : lengths) {
            for (int i = 0; i < length; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
