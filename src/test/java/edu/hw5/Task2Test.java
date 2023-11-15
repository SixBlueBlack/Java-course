package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("all fridays 2022 Test")
    void getAllFridays2022Test() {
        int year = 2022;
        List<LocalDate> fridaysThe13th = List.of(
            LocalDate.of(2022, 5, 13)
        );

        List<LocalDate> result = Task2.getAllFridaysThe13thOfYear(year);

        assertThat(result).isEqualTo(fridaysThe13th);
    }

    @Test
    @DisplayName("all fridays 2024 Test")
    void getAllFridays2001Test() {
        int year = 2024;
        List<LocalDate> fridaysThe13th = List.of(
            LocalDate.of(2024, 9, 13),
            LocalDate.of(2024, 12, 13)
        );

        List<LocalDate> result = Task2.getAllFridaysThe13thOfYear(year);

        assertThat(result).isEqualTo(fridaysThe13th);
    }

    @Test
    @DisplayName("getNextFridayThe13th")
    void getNextFridayTest() {
        LocalDate currentDate = LocalDate.of(2024, 1, 14);

        LocalDate result = Task2.getNextFridayThe13th(currentDate);

        assertThat(result).isEqualTo(LocalDate.of(2024, 9, 13));
    }
}
