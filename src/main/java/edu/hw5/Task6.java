package edu.hw5;

import java.util.regex.Pattern;

public class Task6 {
    private Task6() {
    }

    public static boolean isSubstring(String substring, String string) {
        return Pattern.compile(substring).matcher(string).find();
    }
}
