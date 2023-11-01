package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task6.getHeaviestAnimalOfEachType;
import static org.assertj.core.api.Assertions.assertThat;

public class Task5Test {
    @Test
    @DisplayName("getHeaviestAnimalOfEachType base Test")
    void getHeaviestAnimalOfEachTypeTest() {
        List<Animal> animals = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 2, 3, 2, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 1, 1, true),
            new Animal("O4", Animal.Type.CAT, Animal.Sex.M, 2, 2, 3, true)
        );

        assertThat(getHeaviestAnimalOfEachType(animals).get(Animal.Type.DOG).weight()).isEqualTo(2);
    }
}
