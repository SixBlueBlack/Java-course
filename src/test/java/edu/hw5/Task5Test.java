package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("base true Test 1")
    void baseTrueTest() {
        String autoNumber = "А123ВЕ777";

        boolean result = Task5.isAutoNumberRight(autoNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("base true Test 2")
    void baseTrueTest2() {
        String autoNumber = "О777ОО177";

        boolean result = Task5.isAutoNumberRight(autoNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("base false Test")
    void baseFalseTest() {
        String autoNumber = "А123ВГ77";

        boolean result = Task5.isAutoNumberRight(autoNumber);

        assertThat(result).isFalse();
    }

}
