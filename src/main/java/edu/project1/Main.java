package edu.project1;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        var game = new Game();
        var consoleHandler = new ConsoleHandler(game);
        game.makeWord();
        consoleHandler.run();
    }
}
