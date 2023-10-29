package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("lowerCase test 1")
    void lowerCaseTest() {
        String inputString = "ab";
        assertThat(Task1.atbash(inputString)).isEqualTo("zy");
    }

    @Test
    @DisplayName("upperCase test 1")
    void upperCaseTest() {
        String inputString = "AB";
        assertThat(Task1.atbash(inputString)).isEqualTo("ZY");
    }

    @Test
    @DisplayName("upper and lower case letters test")
    void upperAndLowerCaseTest() {
        String inputString = "Hello";
        assertThat(Task1.atbash(inputString)).isEqualTo("Svool");
    }

    @Test
    @DisplayName("special symbols test")
    void specialSymbolsTest() {
        String inputString = "! я";
        assertThat(Task1.atbash(inputString)).isEqualTo("! я");
    }

    @Test
    @DisplayName("base test 1")
    void baseTest1() {
        String inputString = "Hello world!";
        assertThat(Task1.atbash(inputString)).isEqualTo("Svool dliow!");
    }

    @Test
    @DisplayName("base test 2")
    void baseTest2() {
        String inputString =
            "Any fool can write code that a computer can understand. Good programmers write code that " +
                "humans can understand. ― Martin Fowler";
        assertThat(Task1.atbash(inputString)).isEqualTo(
            "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg " +
                "sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi");
    }
    @Test
    @DisplayName("null test")
    void nullTest3() {
        String inputString = null;
        assertThat(Task1.atbash(inputString)).isNull();
    }
}
