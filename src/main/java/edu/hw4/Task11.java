package edu.hw4;

import java.util.List;

public class Task11 {
    private static final int CENTIMETERS_PER_METER = 100;

    private Task11() {
    }

    public static List<Animal> getListOfAnimalsThatCanBiteAndAboveMeter(List<Animal> animals) {
        return animals.stream().filter(animal -> animal.bites() && animal.height() > CENTIMETERS_PER_METER).toList();
    }
}
