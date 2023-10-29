package edu.hw3;

import java.util.ArrayList;

public class Task2 {
    private Task2() {
    }

    public static ArrayList<String> clusterize(String bracketSequence) {
        if (bracketSequence == null || bracketSequence.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int bracketsToClose = 0;
        int startIndex = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < bracketSequence.length(); i++) {
            if (bracketSequence.charAt(i) == '(') {
                bracketsToClose++;
            } else {
                bracketsToClose--;
            }
            if (bracketsToClose == 0) {
                result.add(bracketSequence.substring(startIndex, i + 1));
                startIndex = i + 1;
            }
        }
        return result;
    }
}
