package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int cell = 0; cell < board[i].length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(monoHorizontal(new char[][]{{'A', 'B', 'C'}, {'X', 'X', 'X'}}, 1));
    }
}