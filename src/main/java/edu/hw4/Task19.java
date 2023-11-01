package edu.hw4;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task19 {
    private Task19() {
    }

    public static Map<String, Set<ValidationError>> getMapAnimalNameToErrorsInRecordSet(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.toMap(Animal::name, animal -> Stream.of(new HeightError(), new WeightError())
                .filter(error -> !error.isValid(animal))
                .collect(Collectors.toSet())));
    }
}
