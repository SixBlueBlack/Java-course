package edu.hw1;

public class Task2 {
    private static final int RANK = 10;

    private Task2() {
    }

    public static int countDigits(int number) {
        int numberAbs = Math.abs(number);
        int count = 0;

        do {
            numberAbs /= RANK;
            count++;
        } while (numberAbs > 0);
        return count;
    }
}
