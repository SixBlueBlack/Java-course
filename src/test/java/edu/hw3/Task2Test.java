package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("base test 1")
    void baseTest1() {
        String inputBracketSequence = "()()()";
        List<String> result = Arrays.asList("()", "()", "()");
        assertThat(Task2.clusterize(inputBracketSequence)).isEqualTo(result);
    }

    @Test
    @DisplayName("base test 2")
    void baseTest2() {
        String inputBracketSequence = "((()))";
        List<String> result = List.of("((()))");
        assertThat(Task2.clusterize(inputBracketSequence)).isEqualTo(result);
    }

    @Test
    @DisplayName("base test 3")
    void baseTest3() {
        String inputBracketSequence = "((()))(())()()(()())";
        List<String> result = Arrays.asList("((()))", "(())", "()", "()", "(()())");
        assertThat(Task2.clusterize(inputBracketSequence)).isEqualTo(result);
    }

    @Test
    @DisplayName("base test 4")
    void baseTest4() {
        String inputBracketSequence = "((())())(()(()()))";
        List<String> result = Arrays.asList("((())())", "(()(()()))");
        assertThat(Task2.clusterize(inputBracketSequence)).isEqualTo(result);
    }

    @Test
    @DisplayName("null test")
    void nullTest() {
        String inputBracketSequence = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.clusterize(inputBracketSequence));
    }
    @Test
    @DisplayName("empty string test")
    void emptyStringTest() {
        String inputBracketSequence = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.clusterize(inputBracketSequence));
    }
}
