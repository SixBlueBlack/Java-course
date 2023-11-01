package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task10.getListOfAnimalsWhoseAgeIsNotEqualToNumberOfPaws;
import static org.assertj.core.api.Assertions.assertThat;

public class Task10Test {
    @Test
    @DisplayName("getListOfAnimalsWhoseAgeIsNotEqualToNumberOfPaws base Test")
    void getListOfAnimalsWhoseAgeIsNotEqualToNumberOfPawsTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 4, 100, 3, true),
            new Animal("B31", Animal.Type.FISH, Animal.Sex.F, 2, 150, 5, true),
            new Animal("O4", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getListOfAnimalsWhoseAgeIsNotEqualToNumberOfPaws(animals)).hasSize(2);
    }
}
