package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("containsMoreThan3SymbolsAndThirdIsZero true Test")
    void containsMoreThan3SymbolsAndThirdIsZeroTrueTest() {
        String string = "100110";

        boolean result = Task7.containsMoreThan3SymbolsAndThirdIsZero(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("containsMoreThan3SymbolsAndThirdIsZero false Test")
    void containsMoreThan3SymbolsAndThirdIsZeroFalseTest() {
        String string = "101110";

        boolean result = Task7.containsMoreThan3SymbolsAndThirdIsZero(string);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("firstAndLastSymbolsAreEqual true Test")
    void firstAndLastSymbolsAreEqualTrueTest() {
        String string = "101111";

        boolean result = Task7.firstAndLastSymbolsAreEqual(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("firstAndLastSymbolsAreEqual false Test")
    void firstAndLastSymbolsAreEqualFalseTest() {
        String string = "101110";

        boolean result = Task7.firstAndLastSymbolsAreEqual(string);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("isLengthBetweenOneAndThree true Test")
    void isLengthBetweenOneAndThreeTrueTest() {
        String string = "101";

        boolean result = Task7.isLengthBetweenOneAndThree(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("isLengthBetweenOneAndThree false Test")
    void isLengthBetweenOneAndThreeFalseTest() {
        String string = "";

        boolean result = Task7.isLengthBetweenOneAndThree(string);

        assertThat(result).isFalse();
    }
}
