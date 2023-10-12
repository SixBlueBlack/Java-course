package edu.hw1;

public class Task7 {
    private Task7() {
    }

    public static String rotateRight(int n, int shift) {
        String binaryString = Integer.toBinaryString(n);
        int modShift = shift % binaryString.length();
        String tempString = binaryString.substring(binaryString.length() - modShift);
        return tempString + binaryString.substring(0, binaryString.length() - modShift);
    }

    public static String rotateLeft(int n, int shift) {
        String binaryString = Integer.toBinaryString(n);
        int modShift = shift % binaryString.length();
        String tempString = binaryString.substring(0, modShift);
        return binaryString.substring(modShift) + tempString;
    }
}
