package edu.project2;

public class RecursiveBacktrackerGenerator implements MazeGenerator {
    public Cell[][] generateMaze(int width, int height) {
        Cell[][] maze = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if ((x % 2 != 0 && y % 2 != 0) && (y < height - 1 && x < width - 1)) {
                    maze[x][y] = new Cell(x, y, false);
                } else {
                    maze[x][y] = new Cell(x, y, true);
                }
            }
        }
        return maze;
    }
}
