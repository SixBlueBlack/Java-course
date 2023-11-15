package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("2020-10-10 format Test")
    void baseTest1() {
        String date = "2020-10-10";
        LocalDate parsedDate = LocalDate.of(2020, 10, 10);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("2020-12-2 format Test")
    void baseTest2() {
        String date = "2020-12-2";
        LocalDate parsedDate = LocalDate.of(2020, 12, 2);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("1/3/1976 format Test")
    void baseTest3() {
        String date = "1/3/1976";
        LocalDate parsedDate = LocalDate.of(1976, 1, 3);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("1/3/20 format Test")
    void baseTest4() {
        String date = "1/3/20";
        LocalDate parsedDate = LocalDate.of(2020, 1, 3);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("tomorrow format Test")
    void baseTest5() {
        String date = "tomorrow";
        LocalDate parsedDate = LocalDate.now().plusDays(1);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("today format Test")
    void baseTest6() {
        String date = "today";
        LocalDate parsedDate = LocalDate.now();

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("yesterday format Test")
    void baseTest7() {
        String date = "yesterday";
        LocalDate parsedDate = LocalDate.now().minusDays(1);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("1 day ago format Test")
    void baseTest8() {
        String date = "1 day ago";
        LocalDate parsedDate = LocalDate.now().minusDays(1);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }

    @Test
    @DisplayName("2234 days ago format Test")
    void baseTest9() {
        String date = "2234 days ago";
        LocalDate parsedDate = LocalDate.now().minusDays(2234);

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result.get()).isEqualTo(parsedDate);
    }
    @Test
    @DisplayName("a days ago format Test")
    void errorTest9() {
        String date = "a days ago";

        Optional<LocalDate> result = Task3.parseDate(date);

        assertThat(result).isEmpty();
    }
}
