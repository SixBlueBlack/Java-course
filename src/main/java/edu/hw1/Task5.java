package edu.hw1;

public class Task5 {
    private static final int RANK = 10;

    private Task5() {
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reversedNumber = 0;

        while (palindrome != 0) {
            reversedNumber = reversedNumber * RANK + palindrome % RANK;
            palindrome = palindrome / RANK;
        }

        return number == reversedNumber;
    }

    public static boolean isPalindromeDescendant(int number) {
        String string = String.valueOf(number);

        while (string.length() > 1) {
            if (isPalindrome(Integer.parseInt(string))) {
                return true;
            }
            var stringBuilder = new StringBuilder();
            for (int i = 1; i <= string.length(); i += 2) {
                int number1 = Character.getNumericValue(string.charAt(i));
                int number2 = Character.getNumericValue(string.charAt(i - 1));
                stringBuilder.append(number1 + number2);
            }
            string = stringBuilder.toString();
        }
        return false;
    }
}

