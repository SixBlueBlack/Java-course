package edu.project2;

public class OutputHandler {
    public OutputHandler() {
    }

    @SuppressWarnings("RegexpSinglelineJava")
    public void outputMaze(Maze maze) {
        for (int x = 0; x < maze.getWidth(); x++) {
            StringBuilder line = new StringBuilder();
            for (int y = 0; y < maze.getHeight(); y++) {
                line.append(maze.getCell(x, y));
            }
            System.out.println(line);
        }
    }
}
