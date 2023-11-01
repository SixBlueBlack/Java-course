package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task16.getAnimalListSortedBySpeciesThenSexThenName;
import static org.assertj.core.api.Assertions.assertThat;

public class Task16Test {
    @Test @DisplayName("getAnimalListSortedBySpeciesThenSexThenName Test")
    void getAnimalListSortedBySpeciesThenSexThenNameTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 2", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        List<Animal> sortedAnimals = getAnimalListSortedBySpeciesThenSexThenName(animals);
        assertThat(sortedAnimals.getFirst().name()).isEqualTo("O 4 2");
        assertThat(sortedAnimals.get(1).name()).isEqualTo("A");
        assertThat(sortedAnimals.get(2).name()).isEqualTo("B31");
        assertThat(sortedAnimals.get(3).name()).isEqualTo("O 4 1");
    }
}
