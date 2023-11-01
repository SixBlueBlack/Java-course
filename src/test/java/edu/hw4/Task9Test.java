package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task9.getTotalNumberOfPawsInAnimalList;
import static org.assertj.core.api.Assertions.assertThat;

public class Task9Test {
    @Test
    @DisplayName("getTotalNumberOfPawsInAnimalList base Test")
    void getTotalNumberOfPawsInAnimalListTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 100, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 150, 5, true),
            new Animal("O4", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O4", Animal.Type.BIRD, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getTotalNumberOfPawsInAnimalList(animals)).isEqualTo(14);
    }
}
