package edu.hw1;

public class Task2 {
    private static final int RANK = 10;

    private Task2() {
    }

    public static int countDigits(int number) {
        int numberCopy = number;
        if (numberCopy == 0) {
            return 1;
        }

        int count = 0;
        while (numberCopy > 0) {
            numberCopy /= RANK;
            count++;
        }
        return count;
    }
}
