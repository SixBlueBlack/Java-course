package edu.hw5;

public class Task7 {
    private Task7() {
    }

    public static boolean containsMoreThan3SymbolsAndThirdIsZero(String input) {
        return input.matches("^.{2}0.*$");
    }

    public static boolean firstAndLastSymbolsAreEqual(String input) {
        return input.matches("^([01]).*\\1$");
    }

    public static boolean isLengthBetweenOneAndThree(String input) {
        return input.matches("^[01]{1,3}$");
    }
}
