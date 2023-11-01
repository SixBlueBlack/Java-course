package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task17.isSpidersBiteMoreOftenThanDogs;
import static org.assertj.core.api.Assertions.assertThat;

public class Task17Test {
    @Test @DisplayName("isSpidersBiteMoreOftenThanDogs Test")
    void isSpidersBiteMoreOftenThanDogsTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 1", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(isSpidersBiteMoreOftenThanDogs(animals)).isTrue();
    }

    @Test @DisplayName("no dogs Test")
    void noDogsTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.FISH, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 1", Animal.Type.FISH, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(isSpidersBiteMoreOftenThanDogs(animals)).isFalse();
    }

    @Test @DisplayName("no spiders Test")
    void noSpidersTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.FISH, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 1", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(isSpidersBiteMoreOftenThanDogs(animals)).isFalse();
    }
}
