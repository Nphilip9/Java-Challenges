package it.nphilip.challenges.Factorial;

public class Main {
    public static void main(String[] args) {
        factorial(4);
    }

    public static void factorial(int factorial) {
        int factorialRes = 1;
        for (int i = 1; i <= factorial; i++) {
            factorialRes = factorialRes * i;
        }
        System.out.println(factorialRes);
    }
}
