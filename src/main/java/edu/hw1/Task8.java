package edu.hw1;

public class Task8 {
    public static final int BOARD_SIZE = 8;
    public static final int[][] KNIGHT_MOVES = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    private Task8() {
    }

    public static boolean knightBoardCapture(int[][] board) {
        for (int x = 0; x < board[0].length; x++) {
            for (int y = 0; y < board.length; y++) {
                if (board[y][x] == 1 && checkKnight(board, x, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkKnight(int[][] board, int x, int y) {
        for (var move : KNIGHT_MOVES) {
            if (x + move[0] < BOARD_SIZE && x + move[0] >= 0 && y + move[1] < BOARD_SIZE && y + move[1] >= 0
                && board[y + move[1]][x + move[0]] == 1) {
                return true;
            }
        }
        return false;
    }
}
