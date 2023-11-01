package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task13.getListOfAnimalsWhoseNamesContainsMoreThanTwoWords;
import static org.assertj.core.api.Assertions.assertThat;

public class Task13Test {
    @Test
    @DisplayName("getListOfAnimalsWhoseNamesContainsMoreThanTwoWords Test")
    void getListOfAnimalsWhoseNamesContainsMoreThanTwoWordsTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 150, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getListOfAnimalsWhoseNamesContainsMoreThanTwoWords(animals)).hasSize(1);
    }
}
