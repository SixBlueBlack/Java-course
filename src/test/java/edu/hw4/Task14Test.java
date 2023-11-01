package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task14.isListContainsDogAboveKCm;
import static org.assertj.core.api.Assertions.assertThat;

public class Task14Test {
    @Test
    @DisplayName("IsListContainsDogAboveKCm Test")
    void isListContainsDogAboveKCmTest() {
        int k = 150;
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(isListContainsDogAboveKCm(animals, k)).isFalse();
    }
}
