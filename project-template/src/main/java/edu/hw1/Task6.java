package edu.hw1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public static final int KAPREKARS_ROUTINE = 6174;

    private Task6() {
    }

    public static int countK(int number) {
        int increasedOrderSorted =
            Integer.parseInt(Stream.of(String.valueOf(number).split(""))
                .sorted()
                .collect(Collectors.joining()));
        int decreasedOrderSorted =
            Integer.parseInt(Stream.of(String.valueOf(number).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
        if (decreasedOrderSorted - increasedOrderSorted == KAPREKARS_ROUTINE) {
            return 1;
        }
        return 1 + countK(decreasedOrderSorted - increasedOrderSorted);
    }
}
