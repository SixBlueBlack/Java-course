package edu.hw5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Task3 {
    private Task3() {
    }

    public static Optional<LocalDate> parseDate(String string) {
        DateTimeFormatter[] dateTimeFormatters = {
            DateTimeFormatter.ofPattern("M/d/yyyy"),
            DateTimeFormatter.ofPattern("M/d/yy"),
            DateTimeFormatter.ofPattern("yyyy-M-d")
        };
        for (DateTimeFormatter dateTimeFormatter : dateTimeFormatters) {
            try {
                return Optional.of(LocalDate.parse(string, dateTimeFormatter));
            } catch (Exception ignored) {
            }
        }

        LocalDate localDate = null;
        if (string.equals("today")) {
            localDate = LocalDate.now();
        }

        if (string.equals("tomorrow")) {
            localDate = LocalDate.now().plusDays(1);
        }

        if (string.equals("yesterday")) {
            localDate = LocalDate.now().minusDays(1);
        }

        if (string.endsWith(" day ago") || string.endsWith(" days ago")) {
            try {
                localDate = LocalDate.now().minusDays(Integer.parseInt(string.split(" ")[0]));
            } catch (Exception ignored) {
            }
        }

        return Optional.ofNullable(localDate);
    }
}
