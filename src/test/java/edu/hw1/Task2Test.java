package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Test 1")
    void baseTest1() {
        int number = 4666;
        int countDigits = Task2.countDigits(number);
        assertThat(countDigits).isEqualTo(4);
    }

    @Test
    @DisplayName("Test 2")
    void baseTest2() {
        int number = 544;
        int countDigits = Task2.countDigits(number);
        assertThat(countDigits).isEqualTo(3);
    }

    @Test
    @DisplayName("input is 0")
    void zeroTest() {
        int number = 0;
        int countDigits = Task2.countDigits(number);
        assertThat(countDigits).isEqualTo(1);
    }
    @Test
    @DisplayName("input is negative")
    void negativeInputTest() {
        int number = -100;
        int countDigits = Task2.countDigits(number);
        assertThat(countDigits).isEqualTo(3);
    }
}
