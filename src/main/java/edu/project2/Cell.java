package edu.project2;

public class Cell {
    private final int x;
    private final int y;

    public Boolean isWall = false;
    public Boolean isVisited = false;

    public Cell(int x, int y, boolean isWall) {
        this.x = x;
        this.y = y;
        this.isWall = isWall;
    }

    @Override
    public String toString() {
        return isWall ? "#" : " ";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
