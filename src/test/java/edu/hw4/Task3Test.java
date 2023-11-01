package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;
import static edu.hw4.Task3.getCountOfEachAnimalType;
import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {
    @Test
    @DisplayName("getCountOfEachAnimalType base Test")
    void getCountOfEachAnimalTypeBaseTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 2, 3, 3, true),
            new Animal("B", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O", Animal.Type.DOG, Animal.Sex.F, 2, 2, 2, true)
        );

        assertThat(getCountOfEachAnimalType(animals).get(Animal.Type.DOG)).isEqualTo(3);
    }
}
