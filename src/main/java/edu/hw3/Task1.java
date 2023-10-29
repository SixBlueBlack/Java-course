package edu.hw3;

public class Task1 {
    private static final int ALPHABET_SIZE = 26;
    private static final int UPPER_A_CODE = 'A';
    private static final int LOWER_A_CODE = 'a';

    private Task1() {
    }

    public static String atbash(String string) {
        if (string == null) {
            return null;
        }
        var stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            Character letter = string.charAt(i);
            int newLetterCode;

            if (letter >= UPPER_A_CODE && letter < UPPER_A_CODE + ALPHABET_SIZE) {
                newLetterCode = UPPER_A_CODE;
            } else if (letter >= LOWER_A_CODE && letter < LOWER_A_CODE + ALPHABET_SIZE) {
                newLetterCode = LOWER_A_CODE;
            } else {
                stringBuilder.append(letter);
                continue;
            }
            stringBuilder.append((char) (ALPHABET_SIZE - string.charAt(i) + 2 * newLetterCode - 1));
        }
        return stringBuilder.toString();
    }
}
