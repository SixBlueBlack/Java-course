package edu.hw4;

public class WeightError implements ValidationError {
    @Override
    public boolean isValid(Animal animal) {
        return animal.weight() > 0;
    }

    @Override
    public String toString() {
        return "Animal weight must be positive";
    }
}
