package edu.hw3.Task6;

import org.jetbrains.annotations.NotNull;

public record Stock(Integer price) implements Comparable<Stock> {
    @Override
    public int compareTo(@NotNull Stock otherStock) {
        return Integer.compare(price, otherStock.price());
    }
}
