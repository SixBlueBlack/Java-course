package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Task1 {
    private Task1() {
    }

    private static final String TIME_PATTERN = "yyyy-MM-dd, HH:mm";
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static String getAverageSessionsDuration(List<String> sessions) {
        if (sessions == null || sessions.isEmpty()) {
            return "0ч 0м";
        }

        long totalTime = 0L;
        for (String session : sessions) {
            String[] splittedSessionString = session.split(" - ");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(TIME_PATTERN);

            LocalDateTime from = LocalDateTime.parse(
                splittedSessionString[0],
                dateTimeFormatter
            );
            LocalDateTime to = LocalDateTime.parse(
                splittedSessionString[1],
                dateTimeFormatter
            );

            Duration duration = Duration.between(from, to);
            totalTime += duration.getSeconds();
        }

        long averageTime = totalTime / sessions.size();
        return String.format(
            "%dч %dм",
            averageTime / SECONDS_IN_HOUR,
            (averageTime % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
        );
    }
}
