package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task8Test {
    @Test
    @DisplayName("hasOddLength true Test")
    void hasOddLengthTrueTest() {
        String string = "1";

        boolean result = Task8.hasOddLength(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("hasOddLength false Test")
    void hasOddLengthFalseTest() {
        String string = "1001";

        boolean result = Task8.hasOddLength(string);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("isNumberOf0IsMultipleOf3 true Test")
    void isNumberOf0IsMultipleOf3TrueTest() {
        String string = "1000";

        boolean result = Task8.isNumberOf0IsMultipleOf3(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("isNumberOf0IsMultipleOf3 false Test")
    void isNumberOf0IsMultipleOf3FalseTest() {
        String string = "10000";

        boolean result = Task8.isNumberOf0IsMultipleOf3(string);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("isOddNumberIsOdd true Test")
    void isOddNumberIsOddTrueTest() {
        String string = "10101";

        boolean result = Task8.isOddNumberIsOdd(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("isOddNumberIsOdd false Test")
    void isOddNumberIsOddFalseTest() {
        String string = "10011";

        boolean result = Task8.isOddNumberIsOdd(string);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("hasNo11InString true Test")
    void hasNo11InStringTrueTest() {
        String string = "10010";

        boolean result = Task8.hasNo11InString(string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("hasNo11InString false Test")
    void hasNo11InStringFalseTest() {
        String string = "10011";

        boolean result = Task8.hasNo11InString(string);

        assertThat(result).isFalse();
    }
}
