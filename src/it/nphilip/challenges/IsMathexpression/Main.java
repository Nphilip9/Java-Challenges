package it.nphilip.challenges.IsMathexpression;

public class Main {
    public static void main(String[] args) {
        isMathExpression("2*");
    }

    public static void isMathExpression(String text) {
        boolean check = false;
        String numbers = "1234567890";

        if(text.contains("+")) {
            for (char textChar : text.toCharArray()) {
                if(!String.valueOf(textChar).equals("*")) {
                    if(numbers.contains(String.valueOf(textChar))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        } else if(text.contains("-")) {
            for (char textChar : text.toCharArray()) {
                if(!String.valueOf(textChar).equals("*")) {
                    if(numbers.contains(String.valueOf(textChar))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        } else if(text.contains("*")) {
            for (char textChar : text.toCharArray()) {
                if(!String.valueOf(textChar).equals("*")) {
                    if(numbers.contains(String.valueOf(textChar))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        } else if(text.contains("/")) {
            for (char textChar : text.toCharArray()) {
                if(!String.valueOf(textChar).equals("*")) {
                    if(numbers.contains(String.valueOf(textChar))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        } else if(text.contains("%")) {
            for (char textChar : text.toCharArray()) {
                if(!String.valueOf(textChar).equals("*")) {
                    if(numbers.contains(String.valueOf(textChar))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        }
        System.out.println(check);
    }
}
