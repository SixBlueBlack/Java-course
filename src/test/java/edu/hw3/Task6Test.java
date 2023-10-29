package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockMarket;
import edu.hw3.Task6.StockMarketImplementation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("base test 1")
    void baseTest1() {
        Stock stock1 = new Stock(30);
        Stock stock2 = new Stock(10);
        Stock stock3 = new Stock(20);
        StockMarket stockMarket = new StockMarketImplementation();

        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);
        assertThat(stockMarket.mostValuableStock().price()).isEqualTo(30);
    }

    @Test
    @DisplayName("base test 1")
    void removeTest() {
        Stock stock1 = new Stock(30);
        Stock stock2 = new Stock(10);
        StockMarket stockMarket = new StockMarketImplementation();

        stockMarket.add(stock2);
        stockMarket.add(stock1);
        stockMarket.remove(stock1);
        assertThat(stockMarket.mostValuableStock().price()).isEqualTo(10);
    }
    @Test
    @DisplayName("empty priorityQueue")
    void emptyPriorityQueueTest() {
        StockMarket stockMarket = new StockMarketImplementation();
        assertThat(stockMarket.mostValuableStock()).isNull();
    }
}
