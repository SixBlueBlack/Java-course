package edu.hw4;

import java.util.List;

public class Task17 {
    private Task17() {
    }

    public static Boolean isSpidersBiteMoreOftenThanDogs(List<Animal> animals) {
        double bitingSpidersPercentage = (double) animals.stream()
            .filter(animal -> animal.type() == Animal.Type.SPIDER)
            .filter(Animal::bites).count()
            / animals.stream()
            .filter(animal -> animal.type() == Animal.Type.SPIDER).count();

        double bitingDogsPercentage = (double) animals.stream()
            .filter(animal -> animal.type() == Animal.Type.DOG)
            .filter(Animal::bites).count()
            / animals.stream()
            .filter(animal -> animal.type() == Animal.Type.DOG).count();

        return bitingSpidersPercentage > bitingDogsPercentage;
    }
}
