package edu.hw4;

import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw4.Task1.getSortedByHeightAnimals;
import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {
    @Test
    @DisplayName("sorting by height Test")
    void sortingTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 2, 3, 3, true),
            new Animal("B", Animal.Type.DOG, Animal.Sex.F, 2, 1, 3, true),
            new Animal("O", Animal.Type.DOG, Animal.Sex.F, 2, 2, 3, true)
        );

        assertThat(getSortedByHeightAnimals(animals)).isSortedAccordingTo(Comparator.comparing(Animal::height));
    }
}
