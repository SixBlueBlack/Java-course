package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("base true Test")
    void baseTrueTest() {
        String password = "fasdasfsaf%sdggsd123";

        boolean result = Task4.isPasswordRight(password);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("base false Test")
    void baseFalseTest() {
        String password = "fasdasfsafsdggsd123";

        boolean result = Task4.isPasswordRight(password);

        assertThat(result).isFalse();
    }
}
