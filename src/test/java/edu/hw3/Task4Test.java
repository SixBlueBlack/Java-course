package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("base test 1")
    void baseTest1() {
        int arabicNumber = 2;
        String romanNumber = "II";
        assertThat(Task4.convertToRoman(arabicNumber)).isEqualTo(romanNumber);
    }

    @Test
    @DisplayName("base test 2")
    void baseTest2() {
        int arabicNumber = 12;
        String romanNumber = "XII";
        assertThat(Task4.convertToRoman(arabicNumber)).isEqualTo(romanNumber);
    }

    @Test
    @DisplayName("base test 3")
    void baseTest3() {
        int arabicNumber = 16;
        String romanNumber = "XVI";
        assertThat(Task4.convertToRoman(arabicNumber)).isEqualTo(romanNumber);
    }
    @Test
    @DisplayName("base test 3")
    void baseTest4() {
        int arabicNumber = 1192;
        String romanNumber = "MCXCII";
        assertThat(Task4.convertToRoman(arabicNumber)).isEqualTo(romanNumber);
    }
}
