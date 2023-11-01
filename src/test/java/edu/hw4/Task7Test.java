package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task7.getKEldestAnimal;
import static org.assertj.core.api.Assertions.assertThat;

public class Task7Test {
    @Test
    @DisplayName("getKEldestAnimal base Test")
    void getKEldestAnimalTest() {
        int k = 2;
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 3, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O4", Animal.Type.DOG, Animal.Sex.M, 1, 2, 2, true)
        );

        assertThat(getKEldestAnimal(animals, k).age()).isEqualTo(2);
    }

    @Test
    @DisplayName("K is bigger than list length")
    void kIsBiggerThanListLengthTest() {
        int k = 4;
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 3, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O4", Animal.Type.DOG, Animal.Sex.M, 1, 2, 2, true)
        );

        assertThat(getKEldestAnimal(animals, k)).isNull();
    }
}
