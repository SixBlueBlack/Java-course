package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task19.getMapAnimalNameToErrorsInRecordSet;
import static org.assertj.core.api.Assertions.assertThat;

public class Task19Test {
    @Test @DisplayName("heightError Test")
    void heightErrorTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 4, -1, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 2", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getMapAnimalNameToErrorsInRecordSet(animals).get("A")
            .toArray()[0]).isInstanceOf(ValidationError.class);
        assertThat(getMapAnimalNameToErrorsInRecordSet(animals).get("A").toArray()[0]).isInstanceOf(HeightError.class);
    }

    @Test @DisplayName("heightError Test")
    void weightErrorTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 4, 3, -2, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 2", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getMapAnimalNameToErrorsInRecordSet(animals).get("A")
            .toArray()[0]).isInstanceOf(ValidationError.class);
        assertThat(getMapAnimalNameToErrorsInRecordSet(animals).get("A").toArray()[0]).isInstanceOf(WeightError.class);
    }

    @Test @DisplayName("no Error Test")
    void noErrorTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 4, -1, -2, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true),
            new Animal("O 4 2", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );

        assertThat(getMapAnimalNameToErrorsInRecordSet(animals).get("B31")).isEmpty();
    }
}
