package edu.hw1;

public class Task5 {
    private Task5() {
    }

    public static boolean isPalindrome(String number) {
        int i1 = 0;
        int i2 = number.length() - 1;

        while (i2 > i1) {
            if (number.charAt(i2--) != number.charAt(i1++)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeDescendant(int number) {
        String string = String.valueOf(number);

        while (string.length() > 1) {
            if (isPalindrome(string)) {
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

