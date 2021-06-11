package it.nphilip.challenges.FixBasicCalculator;

import java.lang.constant.Constable;

public class Main {
    public static void main(String[] args) {
        System.out.println(basicCalculator(2, 'x', 3));
    }

    public static int basicCalculator(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '/':
                if(num2 != 0) {
                    return num1 / num2;
                }
                break;
            case '*':
                return num1 * num2;
            default:
                break;
        }
        return Integer.MAX_VALUE;
    }
}
