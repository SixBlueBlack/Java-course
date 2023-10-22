package edu.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProjectTest {
    @Test
    @DisplayName("Wrong length of makeWord custom word")
    void wrongLengthOfMakeWordCustomWord() {
        var game = new Game();
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.makeWord(""));
    }

    @Test
    @DisplayName("custom word game won test")
    void customWordGameWonTest() {
        var game = new Game();
        game.makeWord("a");
        game.guessLetter('a');
        assertThat(game.isGameWon()).isTrue();
    }

    @Test
    @DisplayName("guess letter no such letter")
    void guessLetterNoSuchLetter() {
        var game = new Game();
        game.makeWord("a");
        assertThat(game.guessLetter('b')).isNull();
    }

    @Test
    @DisplayName("custom word game loose test")
    void customWordGameLooseTest() {
        var game = new Game();
        game.makeWord("a");
        for (int i = 0; i < 5; i++) {
            game.increaseMistakesCount();
        }
        assertThat(game.isGameLoose()).isTrue();
    }

    @Test
    @DisplayName("process input wrong length")
    void processInputWrongLength() {
        var game = new Game();
        var consoleHandler = new ConsoleHandler(game);
        Character letter = consoleHandler.processInput("as");
        assertThat(letter).isNull();
    }

    @Test
    @DisplayName("process input wrong character")
    void processInputWrongCharacter() {
        var game = new Game();
        var consoleHandler = new ConsoleHandler(game);
        Character letter = consoleHandler.processInput("]");
        assertThat(letter).isNull();
    }

    @Test
    @DisplayName("correct input for processInput")
    void correctInput() {
        var game = new Game();
        var consoleHandler = new ConsoleHandler(game);
        String input = "a";
        Character letter = consoleHandler.processInput(input);
        assertThat(letter).isEqualTo(input.charAt(0));
    }

}
