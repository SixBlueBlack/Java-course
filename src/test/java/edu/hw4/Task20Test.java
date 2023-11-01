package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task20.getMapAnimalNameToErrorsDescription;
import static org.assertj.core.api.Assertions.assertThat;

public class Task20Test {
    @Test @DisplayName("heightError Test")
    void heightErrorTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 4, -1, -1, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 2", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        var animalA = getMapAnimalNameToErrorsDescription(animals).get("A");
        assertThat(animalA).contains("Animal weight must be positive");
        assertThat(animalA).contains("Animal height must be positive");
    }
}
