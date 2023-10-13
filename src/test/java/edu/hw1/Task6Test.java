package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Test 1")
    void baseTest1() {
        int number = 6621;
        int stepsCount = Task6.countK(number);
        assertThat(stepsCount).isEqualTo(5);
    }

    @Test
    @DisplayName("Test 2")
    void baseTest2() {
        int number = 6554;
        int stepsCount = Task6.countK(number);
        assertThat(stepsCount).isEqualTo(4);
    }

    @Test
    @DisplayName("Test 3")
    void baseTest3() {
        int number = 1234;
        int stepsCount = Task6.countK(number);
        assertThat(stepsCount).isEqualTo(3);
    }
}
