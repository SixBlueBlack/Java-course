package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Test 1")
    void baseTest1() {
        String string = "123456";
        String isNestable = Task4.fixString(string);
        assertThat(isNestable).isEqualTo("214365");
    }

    @Test
    @DisplayName("Test 2")
    void baseTest2() {
        String string = "hTsii  s aimex dpus rtni.g";
        String isNestable = Task4.fixString(string);
        assertThat(isNestable).isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("OddCharactersNumber")
    void OddCharactersNumber() {
        String string = "badce";
        String isNestable = Task4.fixString(string);
        assertThat(isNestable).isEqualTo("abcde");
    }
}
