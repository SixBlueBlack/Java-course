package edu.project2;

public final class Main {

    private Main() {
    }
    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;

    public static void main(String[] args) {
        Maze maze = new Maze(WIDTH, HEIGHT, new RecursiveBacktrackerGenerator());
        OutputHandler outputHandler = new OutputHandler();
        outputHandler.outputMaze(maze);
    }
}
