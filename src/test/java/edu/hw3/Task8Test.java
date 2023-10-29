package edu.hw3;

import edu.hw3.Task8.BackwardIterator;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task8Test {
    @Test
    @DisplayName("base test 1")
    void baseTest1() {
        var backwardIterator = new BackwardIterator<>(List.of(1, 2, 3));
        Integer[] result = new Integer[] {3, 2, 1};
        int index = 0;
        while (backwardIterator.hasNext()) {
            assertThat(backwardIterator.next()).isEqualTo(result[index]);
            index++;
        }
    }

    @Test
    @DisplayName("base test 2")
    void baseTest2() {
        HashSet<String> hashSet = new HashSet<>() {{
            add("a");
            add("b");
            add("c");
        }};
        var backwardIterator = new BackwardIterator<>(hashSet);
        String[] result = new String[] {"c", "b", "a"};
        int index = 0;
        while (backwardIterator.hasNext()) {
            assertThat(backwardIterator.next()).isEqualTo(result[index]);
            index++;
        }
    }
}
