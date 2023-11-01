package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task11.getListOfAnimalsThatCanBiteAndAboveMeter;
import static org.assertj.core.api.Assertions.assertThat;

public class Task11Test {
    @Test
    @DisplayName("getListOfAnimalsThatCanBiteAndAboveMeter base Test")
    void getListOfAnimalsThatCanBiteAndAboveMeterTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 150, 5, false),
            new Animal("O4", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getListOfAnimalsThatCanBiteAndAboveMeter(animals)).hasSize(1);
    }
}
