package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task7Test {
    @Test
    @DisplayName("rotateRight Test 1")
    void rotateRightTest1() {
        int number = 8;
        int shift = 1;
        String stepsCount = Task7.rotateRight(number, shift);
        assertThat(stepsCount).isEqualTo("0100");
    }

    @Test
    @DisplayName("rotateRight shift bigger than length test")
    void shiftBiggerThanLengthRotateRightTest() {
        int number = 8;
        int shift = 5;
        String stepsCount = Task7.rotateRight(number, shift);
        assertThat(stepsCount).isEqualTo("0100");
    }

    @Test
    @DisplayName("rotateLeft Test 1")
    void rotateLeftTest1() {
        int number = 16;
        int shift = 1;
        String stepsCount = Task7.rotateLeft(number, shift);
        assertThat(stepsCount).isEqualTo("00001");
    }

    @Test
    @DisplayName("rotateLeft Test 2")
    void rotateLeftTest2() {
        int number = 17;
        int shift = 2;
        String stepsCount = Task7.rotateLeft(number, shift);
        assertThat(stepsCount).isEqualTo("00110");
    }

    @Test
    @DisplayName("rotateLeft shift bigger than length test")
    void shiftBiggerThanLengthRotateLeftTest() {
        int number = 17;
        int shift = 8;
        String stepsCount = Task7.rotateLeft(number, shift);
        assertThat(stepsCount).isEqualTo("01100");
    }
}
