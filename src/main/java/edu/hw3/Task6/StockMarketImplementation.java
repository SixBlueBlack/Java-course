package edu.hw3.Task6;

import java.util.Collections;
import java.util.PriorityQueue;

public class StockMarketImplementation implements StockMarket {
    PriorityQueue<Stock> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

    @Override
    public void add(Stock stock) {
        priorityQueue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        priorityQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return priorityQueue.peek();
    }
}
