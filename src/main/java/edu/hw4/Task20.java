package edu.hw4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task20 {
    private Task20() {
    }

    public static Map<String, String> getMapAnimalNameToErrorsDescription(List<Animal> animals) {
        return Task19.getMapAnimalNameToErrorsInRecordSet(animals).entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString()));
    }

}
