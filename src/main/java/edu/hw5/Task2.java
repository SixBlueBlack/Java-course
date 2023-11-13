package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class Task2 {
    private Task2() {
    }

    private static final int MONTHS_IN_YEAR = 12;
    private static final int THIRTEEN_NUMBER = 13;

    public static ArrayList<LocalDate> getAllFridaysThe13thOfYear(int year) {
        ArrayList<LocalDate> fridaysThe13th = new ArrayList<>();
        for (int i = 1; i <= MONTHS_IN_YEAR; i++) {
            LocalDate localDate = LocalDate.of(year, i, THIRTEEN_NUMBER);
            if (localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                fridaysThe13th.add(localDate);
            }
        }
        return fridaysThe13th;
    }

    public static LocalDate getNextFridayThe13th(LocalDate localDate) {
        var date = localDate.plusDays(1);
        while (date.getDayOfWeek() != DayOfWeek.FRIDAY || date.getDayOfMonth() != THIRTEEN_NUMBER) {
            date = date.plusDays(1);
        }
        return date;
    }
}
