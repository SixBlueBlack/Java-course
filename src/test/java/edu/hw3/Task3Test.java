package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("String array test 1")
    void StringArrayTest1() {
        List<String> inputArray = Arrays.asList("a", "bb", "a", "bb");
        HashMap<String, Integer> result = new HashMap<>() {{
            put("bb", 2);
            put("a", 2);
        }};
        assertThat(Task3.freqDict(inputArray)).isEqualTo(result);
    }

    @Test
    @DisplayName("String array test 2")
    void StringArrayTest2() {
        List<String> inputArray = Arrays.asList("this", "and", "that", "and");
        HashMap<String, Integer> result = new HashMap<>() {{
            put("that", 1);
            put("and", 2);
            put("this", 1);
        }};
        assertThat(Task3.freqDict(inputArray)).isEqualTo(result);
    }

    @Test
    @DisplayName("String array test 3")
    void StringArrayTest3() {
        List<String> inputArray = Arrays.asList("код", "код", "код", "bug");
        HashMap<String, Integer> result = new HashMap<>() {{
            put("код", 3);
            put("bug", 1);
        }};
        assertThat(Task3.freqDict(inputArray)).isEqualTo(result);
    }

    @Test
    @DisplayName("Integer array test")
    void IntegerArrayTest() {
        List<Integer> inputArray = Arrays.asList(1, 1, 2, 2);
        HashMap<Integer, Integer> result = new HashMap<>() {{
            put(1, 2);
            put(2, 2);
        }};
        assertThat(Task3.freqDict(inputArray)).isEqualTo(result);
    }
}
