package edu.hw3.Task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BackwardIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int currentIndex;

    public BackwardIterator(Collection<T> collection) {
        this.list = List.copyOf(collection);
        currentIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex > -1;
    }

    @Override
    public T next() {
        return list.get(currentIndex--);
    }
}
