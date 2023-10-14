package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String brokenString) {
        var stringBuilder = new StringBuilder();

        for (int i = 1; i < brokenString.length(); i += 2) {
            stringBuilder.append(brokenString.charAt(i));
            stringBuilder.append(brokenString.charAt(i - 1));
        }
        if (brokenString.length() % 2 == 1) {
            stringBuilder.append(brokenString.charAt(brokenString.length() - 1));
        }
        return stringBuilder.toString();
    }
}
