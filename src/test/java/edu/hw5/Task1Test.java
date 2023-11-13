package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("base Test")
    void baseTest() {
        List<String> sessions = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-04-02, 01:20"
        );

        String result = Task1.getAverageSessionsDuration(sessions);

        assertThat(result).isEqualTo("3ч 40м");
    }

    @Test
    @DisplayName("one session")
    void oneSessionTest() {
        List<String> sessions = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50"
        );

        String result = Task1.getAverageSessionsDuration(sessions);

        assertThat(result).isEqualTo("3ч 30м");
    }

    @Test
    @DisplayName("zero sessions")
    void zeroSessionsTest() {
        List<String> sessions = List.of();

        String result = Task1.getAverageSessionsDuration(sessions);

        assertThat(result).isEqualTo("0ч 0м");
    }
    @Test
    @DisplayName("null test")
    void nullTest() {
        List<String> sessions = null;

        String result = Task1.getAverageSessionsDuration(sessions);

        assertThat(result).isEqualTo("0ч 0м");
    }
}
