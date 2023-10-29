package edu.hw3;

import java.util.TreeMap;

public class Task4 {
    private Task4() {
    }

    private final static TreeMap<Integer, String> MAP = new TreeMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String convertToRoman(int arabicNumber) {
        int closestLessNumber = MAP.floorKey(arabicNumber);
        if (arabicNumber == closestLessNumber) {
            return MAP.get(arabicNumber);
        }
        return MAP.get(closestLessNumber) + convertToRoman(arabicNumber - closestLessNumber);
    }
}
