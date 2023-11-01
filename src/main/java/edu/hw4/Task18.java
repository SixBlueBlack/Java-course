package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task18 {
    private Task18() {
    }

    public static Animal getHeaviestFishFromSeveralLists(List<List<Animal>> animalsLists) {
        return animalsLists.stream()
            .flatMap(List::stream)
            .filter(animal -> animal.type() == Animal.Type.FISH)
            .max(Comparator.comparing(Animal::weight))
            .orElse(null);
    }
}
