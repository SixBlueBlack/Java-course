package edu.hw3;

import java.util.Map;
import java.util.TreeMap;
import static java.util.Map.entry;

public class Task4 {
    private Task4() {
    }

    private final static TreeMap<Integer, String> MAP = new TreeMap<>(Map.ofEntries(
        entry(1000, "M"),
        entry(900, "CM"),
        entry(500, "D"),
        entry(400, "CD"),
        entry(100, "C"),
        entry(90, "XC"),
        entry(50, "L"),
        entry(40, "XL"),
        entry(10, "X"),
        entry(9, "IX"),
        entry(5, "V"),
        entry(4, "IV"),
        entry(1, "I")
    ));

    public static String convertToRoman(int arabicNumber) {
        int closestLessNumber = MAP.floorKey(arabicNumber);
        if (arabicNumber == closestLessNumber) {
            return MAP.get(arabicNumber);
        }
        return MAP.get(closestLessNumber) + convertToRoman(arabicNumber - closestLessNumber);
    }
}
