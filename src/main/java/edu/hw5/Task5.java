package edu.hw5;

public class Task5 {
    private Task5() {
    }

    public static boolean isAutoNumberRight(String number) {
        return number.matches("^[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}$");
    }
}
