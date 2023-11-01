package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task15.getTotalWeightOfEachTypeOfAnimalsThatAgeFromKToL;
import static org.assertj.core.api.Assertions.assertThat;

public class Task15Test {
    @Test @DisplayName("getTotalWeightOfEachTypeOfAnimalsThatAgeFromKToL Test")
    void getTotalWeightOfEachTypeOfAnimalsThatAgeFromKToLTest() {
        int k = 1;
        int l = 2;
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 1", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getTotalWeightOfEachTypeOfAnimalsThatAgeFromKToL(animals, k, l)
            .get(Animal.Type.DOG))
            .isEqualTo(9);
    }
}
