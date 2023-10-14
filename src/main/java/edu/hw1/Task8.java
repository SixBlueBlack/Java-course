package edu.hw1;

public class Task8 {
    private static final int BOARD_SIZE = 8;
    private static final int[][] KNIGHT_MOVES =
        {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    private Task8() {
    }

    public static boolean knightBoardCapture(int[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == 1 && checkKnight(board, x, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkKnight(int[][] board, int x, int y) {
        for (var move : KNIGHT_MOVES) {
            int offsetX = x + move[0];
            int offsetY = y + move[1];
            if (offsetX < BOARD_SIZE && offsetX >= 0 && offsetY < BOARD_SIZE && offsetY >= 0
                && board[offsetX][offsetY] == 1) {
                return true;
            }
        }
        return false;
    }
}
