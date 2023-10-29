package edu.hw3;

import edu.hw3.Task7.NullComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.TreeMap;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("string treeMap contains Null")
    void containsNullTest() {
        Comparator<String> nullComparator = new NullComparator<>();
        TreeMap<String, String> tree = new TreeMap<>(nullComparator);
        tree.put(null, "test");

        assertThat(tree.containsKey(null)).isTrue();
    }

    @Test
    @DisplayName("integer treeMap null with not null")
    void containsNullTest2() {
        Comparator<Integer> nullComparator = new NullComparator<>();
        TreeMap<Integer, Integer> tree = new TreeMap<>(nullComparator);
        tree.put(null, 1);
        tree.put(1, null);

        assertThat(tree.floorKey(0)).isNull();
    }

    @Test
    @DisplayName("working without null")
    void withoutNullTest() {
        Comparator<Integer> nullComparator = new NullComparator<>();
        TreeMap<Integer, Integer> tree = new TreeMap<>(nullComparator);
        tree.put(3, 1);
        tree.put(1, 3);

        assertThat(tree.floorKey(2)).isEqualTo(1);
    }
}
