package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("base true Test")
    void baseTrueTest() {
        String string = "achfdbaabgabcaabg";
        String substring = "abc";

        boolean result = Task6.isSubstring(substring, string);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("base false Test")
    void baseFalseTest() {
        String string = "achfdbaabgacaabg";
        String substring = "abc";

        boolean result = Task6.isSubstring(substring, string);

        assertThat(result).isFalse();
    }
}
