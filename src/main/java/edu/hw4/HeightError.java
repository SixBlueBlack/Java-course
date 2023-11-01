package edu.hw4;

public class HeightError implements ValidationError {
    @Override
    public boolean isValid(Animal animal) {
        return animal.height() > 0;
    }

    @Override
    public String toString() {
        return "Animal height must be positive";
    }
}
