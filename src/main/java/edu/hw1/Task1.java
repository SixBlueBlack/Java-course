package edu.hw1;

public class Task1 {
    private static final int SECONDS_IN_MINUTE = 60;

    private Task1() {
    }

    public static int minutesToSeconds(String time) {
        boolean separatorPresence = false;
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ':') {
                if (separatorPresence) {
                    return -1;
                }
                separatorPresence = true;
            } else if (!Character.isDigit(time.charAt(i))) {
                return -1;
            }
        }

        String[] splittedString = time.split(":");
        int minutes = Integer.parseInt(splittedString[0]);
        int seconds = Integer.parseInt(splittedString[1]);
        return (seconds >= SECONDS_IN_MINUTE) ? -1 : minutes * SECONDS_IN_MINUTE + seconds;
    }
}
