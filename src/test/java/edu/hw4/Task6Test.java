package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task5.getMostCommonAnimalSex;
import static org.assertj.core.api.Assertions.assertThat;

public class Task6Test {
    @Test
    @DisplayName("getAnimalWithLongestName base Test")
    void getAnimalWithLongestNameTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 2, 3, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O4", Animal.Type.DOG, Animal.Sex.M, 2, 2, 2, true)
        );

        assertThat(getMostCommonAnimalSex(animals)).isEqualTo(Animal.Sex.F);
    }
}
