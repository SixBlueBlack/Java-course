package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {

    @Test
    @DisplayName("Test 1")
    void baseTest1() {
        int[] firstArray = new int[] {1, 2, 3, 4};
        int[] secondArray = new int[] {0, 6};
        boolean isNestable = Task3.isNestable(firstArray, secondArray);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("Test 2")
    void baseTest2() {
        int[] firstArray = new int[] {3, 1};
        int[] secondArray = new int[] {4, 0};
        boolean isNestable = Task3.isNestable(firstArray, secondArray);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("Test 3")
    void baseTest3() {
        int[] firstArray = new int[] {9, 9, 8};
        int[] secondArray = new int[] {8, 9};
        boolean isNestable = Task3.isNestable(firstArray, secondArray);
        assertThat(isNestable).isFalse();
    }

    @Test
    @DisplayName("Test 4")
    void baseTest4() {
        int[] firstArray = new int[] {1, 2, 3, 4};
        int[] secondArray = new int[] {2, 3};
        boolean isNestable = Task3.isNestable(firstArray, secondArray);
        assertThat(isNestable).isFalse();
    }
    @Test
    @DisplayName("empty arrays")
    void emptyArraysTest() {
        int[] firstArray = new int[] {};
        int[] secondArray = new int[] {};
        boolean isNestable = Task3.isNestable(firstArray, secondArray);
        assertThat(isNestable).isFalse();
    }
}
