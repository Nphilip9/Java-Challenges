package it.nphilip.challenges.ValidIP;

public class Main {
    public static void main(String[] args) {
        validIp("127.0.a0.1");
    }

    public static void validIp(String ip) {
        boolean[] rules = {false, true, true};
        char[] charRules = "0123456789.".toCharArray();
        String[] ipSplit = ip.split("\\.");
        char[] ipChars = ip.toCharArray();

        if(ipSplit.length == 4) {
            rules[0] = true;
        }

        for (String fragment : ipSplit) {
            if (!(fragment.toCharArray().length <= 3)) {
                rules[1] = false;
                break;
            }
        }

        for(char ipChar : ipChars) {
            if(!String.valueOf(charRules).contains(String.valueOf(ipChar))) {
                rules[2] = false;
                break;
            }
        }

        System.out.println("Fragment quantity is 4: " + rules[0] +
                           " \nFragments length lower is 3 or lower: " + rules[1] +
                           " \nDoes not contain letters: " + rules[2]);
    }
}
