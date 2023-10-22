package edu.project1;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsoleHandler {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Scanner console = new Scanner(System.in);
    private final Game game;
    private String currentWord;

    public ConsoleHandler(Game game) {
        this.game = game;
    }

    public void run() {
        LOGGER.info("Hello and welcome!; quit - for give up");
        currentWord = game.getCurrentWord();

        while (!game.isGameLoose()) {
            printGuessResult();

            if (game.isGameWon()) {
                LOGGER.info("You won!");
                return;
            }
        }
        LOGGER.info("You lost!");
    }

    public Character processInput(String input) {
        if (input.equals("quit")) {
            LOGGER.info("You gave up!");
            System.exit(0);
        } else if (input.length() > 1 || !Character.isLetter(input.charAt(0))) {
            return null;
        }
        return input.charAt(0);
    }

    public void printGuessResult() {
        LOGGER.info("Guess a letter:");
        String input = console.nextLine();
        Character letter = processInput(input);
        if (letter == null) {
            return;
        }
        String answer = game.guessLetter(letter);

        if (answer == null) {
            String message =
                String.format("Missed, mistake %d out of %d%n\n", game.increaseMistakesCount(), Game.MISTAKES_LIMIT);
            LOGGER.info(message);
        } else {
            LOGGER.info("Hit!\n");
            currentWord = answer;
        }
        String message = String.format("The word: %s\n", currentWord);
        LOGGER.info(message);
    }
}
