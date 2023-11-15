package edu.hw5;

public class Task4 {
    private Task4() {
    }

    public static boolean isPasswordRight(String password) {
        return password.matches(".*[~!@#$%^&*|].*");
    }
}
