package edu.hw4;

import java.util.List;

public class Task9 {
    private Task9() {
    }

    public static Integer getTotalNumberOfPawsInAnimalList(List<Animal> animals) {
        return animals.stream().reduce(0, (sum, animal) -> sum + animal.paws(), Integer::sum);
    }
}
