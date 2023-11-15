package edu.hw5;

public class Task8 {
    private Task8() {
    }

    public static boolean hasOddLength(String input) {
        return input.matches("^(.{2})*.$");
    }

    public static boolean isNumberOf0IsMultipleOf3(String input) {
        return input.matches("^1*(01*01*01*)*$");
    }

    public static boolean isOddNumberIsOdd(String input) {
        return input.matches("^1(01|11)*$");
    }

    public static boolean hasNo11InString(String input) {
        return input.matches("^(?!.*11)[01]*$");
    }
}
