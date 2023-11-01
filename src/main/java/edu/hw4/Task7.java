package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    private Task7() {
    }

    public static Animal getKEldestAnimal(List<Animal> animals, int k) {
        return animals.stream().sorted(Comparator.comparing(Animal::age)).skip(k - 1).findFirst().orElse(null);
    }
}
