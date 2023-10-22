package edu.project1;

import java.util.Random;

public class Game {
    private final String[] possibleWords = new String[] {"apple", "string", "forest"};
    private String hiddenWord;
    private char[] currentWord;
    private int mistakesCount;
    public static final int MISTAKES_LIMIT = 5;

    public void makeWord(String customWord) throws IllegalArgumentException {
        if (customWord.isEmpty()) {
            throw new IllegalArgumentException();
        }
        hiddenWord = customWord;
        currentWord = "*".repeat(hiddenWord.length()).toCharArray();
    }

    public void makeWord() {
        hiddenWord = possibleWords[new Random().nextInt(possibleWords.length)];
        currentWord = "*".repeat(hiddenWord.length()).toCharArray();
    }

    public String guessLetter(char letter) {
        if (hiddenWord.indexOf(letter) == -1) {
            return null;
        }
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == letter) {
                currentWord[i] = letter;
            }
        }
        return getCurrentWord();
    }

    public String getCurrentWord() {
        return new String(currentWord);
    }

    public int increaseMistakesCount() {
        return ++mistakesCount;
    }

    public boolean isGameWon() {
        return hiddenWord.equals(getCurrentWord());
    }

    public boolean isGameLoose() {
        return mistakesCount >= MISTAKES_LIMIT;
    }
}
