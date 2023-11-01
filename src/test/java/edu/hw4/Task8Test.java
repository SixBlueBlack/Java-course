package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task8.getHeaviestAnimalBelowKCentimeters;
import static org.assertj.core.api.Assertions.assertThat;

public class Task8Test {
    @Test
    @DisplayName("getKEldestAnimal base Test")
    void getKEldestAnimalTest() {
        int k = 101;
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 100, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 150, 5, true),
            new Animal("O4", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getHeaviestAnimalBelowKCentimeters(animals, k).get().weight()).isEqualTo(4);
    }
}
