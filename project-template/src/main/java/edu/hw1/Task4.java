package edu.hw1;

public class Task4 {
    private Task4() {
    }

    public static String fixString(String brokenString) {
        var stringBuilder = new StringBuilder();
        String tempString = null;

        for (int i = 0; i < brokenString.length(); i++) {
            if (tempString == null) {
                tempString = String.valueOf(brokenString.charAt(i));
            } else {
                stringBuilder.append(brokenString.charAt(i));
                stringBuilder.append(tempString);
                tempString = null;
            }
        }
        if (tempString != null) {
            stringBuilder.append(tempString);
        }
        return stringBuilder.toString();
    }
}
