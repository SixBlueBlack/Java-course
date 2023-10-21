package edu.hw2;

import edu.hw2.Task2.Rectangle;
import edu.hw2.Task2.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("rectangle area test")
    void rectangleArea() {
        int width = 20;
        int height = 10;
        var rect = new Rectangle();

        rect.setWidth(width);
        rect.setHeight(height);
        assertThat(rect.area()).isEqualTo(200.0);
    }

    @Test
    @DisplayName("square area test")
    void squareArea() {
        int side = 10;
        var rect = new Square();
        rect.setSide(side);
        assertThat(rect.area()).isEqualTo(100.0);
    }
}
