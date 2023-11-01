package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task4.getAnimalWithLongestName;
import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {
    @Test
    @DisplayName("getAnimalWithLongestName base Test")
    void getAnimalWithLongestNameTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 2, 3, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O4", Animal.Type.DOG, Animal.Sex.F, 2, 2, 2, true)
        );

        assertThat(getAnimalWithLongestName(animals).name().length()).isEqualTo(3);
    }

    @Test
    @DisplayName("empty list Test")
    void emptyListTest() {
        List<Animal> animals = List.of();

        assertThat(getAnimalWithLongestName(animals)).isNull();
    }
}
