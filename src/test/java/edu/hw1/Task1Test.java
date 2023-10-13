package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    @DisplayName("Test 1")
    void baseTest1() {
        String time = "01:00";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds).isEqualTo(60);
    }

    @Test
    @DisplayName("Test 2")
    void baseTest2() {
        String time = "13:56";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds).isEqualTo(836);
    }

    @Test
    @DisplayName("number of seconds >= 60")
    void checkNumberOfSeconds() {
        String time = "10:60";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds).isEqualTo(-1);
    }
    @Test
    @DisplayName("number of minutes not limited")
    void numberOfMinutesNotLimited() {
        String time = "999:59";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds).isNotEqualTo(-1);
    }
}
