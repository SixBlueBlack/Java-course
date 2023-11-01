package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw4.Task18.getHeaviestFishFromSeveralLists;
import static org.assertj.core.api.Assertions.assertThat;

public class Task18Test {
    @Test @DisplayName("getHeaviestFishFromSeveralLists Test")
    void getHeaviestFishFromSeveralListsTest() {
        List<Animal> animalsList1 = List.of(
            new Animal("A", Animal.Type.DOG, Animal.Sex.F, 3, 101, 3, true),
            new Animal("B31", Animal.Type.DOG, Animal.Sex.F, 2, 151, 5, false),
            new Animal("HeaviestFish", Animal.Type.FISH, Animal.Sex.M, 1, 99, 5, true),
            new Animal("O 4 1", Animal.Type.DOG, Animal.Sex.M, 1, 99, 4, true)
        );
        List<Animal> animalsList2 = List.of(
            new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 99, 4, true)
        );
        List<Animal> animalsList3 = List.of(
            new Animal("O 4 1", Animal.Type.SPIDER, Animal.Sex.M, 1, 99, 4, true)
        );
        List<List<Animal>> animalsLists = List.of(animalsList1, animalsList2, animalsList3);

        assertThat(getHeaviestFishFromSeveralLists(animalsLists).name()).isEqualTo("HeaviestFish");
    }
}
