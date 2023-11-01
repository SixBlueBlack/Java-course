package edu.hw4;

import java.util.List;

public class Task14 {
    private Task14() {
    }

    public static Boolean isListContainsDogAboveKCm(List<Animal> animals, int k) {
        return animals.stream().anyMatch(animal -> animal.type().equals(Animal.Type.DOG) && animal.height() > k);
    }
}
