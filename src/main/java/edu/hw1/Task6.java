package edu.hw1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    private static final int KAPREKARS_ROUTINE = 6174;
    private static final int NUMBER_LENGTH = 4;
    private static final int BOUNDARY_VALUE = 1000;

    private Task6() {
    }

    public static int countK(int number) {
        String numberString = String.valueOf(number);
        String firstSymbol = String.valueOf(numberString.charAt(0));
        if (number == BOUNDARY_VALUE || numberString.length() != NUMBER_LENGTH
            || numberString.length() - numberString.replace(firstSymbol, "").length() == NUMBER_LENGTH) {
            return -1;
        }
        int increasedOrderSorted =
            Integer.parseInt(Stream.of(numberString.split(""))
                .sorted()
                .collect(Collectors.joining()));
        int decreasedOrderSorted =
            Integer.parseInt(Stream.of(numberString.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
        if (decreasedOrderSorted - increasedOrderSorted == KAPREKARS_ROUTINE) {
            return 1;
        }
        return 1 + countK(decreasedOrderSorted - increasedOrderSorted);
    }
}
