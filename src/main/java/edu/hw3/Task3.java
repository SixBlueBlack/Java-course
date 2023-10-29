package edu.hw3;

import java.util.HashMap;
import java.util.List;

public class Task3 {
    private Task3() {
    }

    public static <T> HashMap<T, Integer> freqDict(List<T> inputArrayList) {
        HashMap<T, Integer> hashMap = new HashMap<>();
        for (T elem : inputArrayList) {
            hashMap.put(elem, hashMap.getOrDefault(elem, 0) + 1);
        }
        return hashMap;
    }
}
