package edu.hw1;

import java.util.Arrays;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] firstArray, int[] secondArray) {
        int min1 = Arrays.stream(firstArray).min().getAsInt();
        int max1 = Arrays.stream(firstArray).max().getAsInt();
        int min2 = Arrays.stream(secondArray).min().getAsInt();
        int max2 = Arrays.stream(secondArray).max().getAsInt();
        return (min1 > min2 && max1 < max2);
    }
}
