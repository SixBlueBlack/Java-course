package edu.project2;

public class Maze {
    private final int width;
    private final int height;
    private Cell[][] maze;

    public Maze(int width, int height, MazeGenerator generator) {
        this.width = width;
        this.height = height;
        maze = generator.generateMaze(width, height);
    }

    public Cell getCell(int x, int y) {
        return maze[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
