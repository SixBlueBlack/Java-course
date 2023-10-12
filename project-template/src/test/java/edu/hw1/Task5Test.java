package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task5Test {
    @Test
    @DisplayName("IsPalindrome Func Test")
    void IsNotPalindromeTest() {
        int number = 11211230;
        boolean isNestable = Task5.isPalindrome(number);
        assertThat(isNestable).isFalse();
    }

    @Test
    @DisplayName("IsPalindrome Func Test Even Length")
    void isPalindromeEvenLengthTest() {
        int number = 1221;
        boolean isNestable = Task5.isPalindrome(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("IsPalindrome Func Test Odd Length")
    void isPalindromeOddLengthTest() {
        int number = 11211;
        boolean isNestable = Task5.isPalindrome(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("isPalindromeDescendant Test 1")
    void isPalindromeDescendantTest1() {
        int number = 11211230;
        boolean isNestable = Task5.isPalindromeDescendant(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("isPalindromeDescendant Test 2")
    void isPalindromeDescendantTest2() {
        int number = 13001120;
        boolean isNestable = Task5.isPalindromeDescendant(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("isPalindromeDescendant Test 3")
    void isPalindromeDescendantTest3() {
        int number = 23336014;
        boolean isNestable = Task5.isPalindromeDescendant(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("isPalindromeDescendant Test 4")
    void isPalindromeDescendantTest4() {
        int number = 11;
        boolean isNestable = Task5.isPalindromeDescendant(number);
        assertThat(isNestable).isTrue();
    }

    @Test
    @DisplayName("isPalindromeDescendant Number less than 10")
    void isPalindromeDescendantTest5() {
        int number = 1;
        boolean isNestable = Task5.isPalindromeDescendant(number);
        assertThat(isNestable).isFalse();
    }
}
