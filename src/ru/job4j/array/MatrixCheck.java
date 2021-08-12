package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
               if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }

        return result;

    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                    result = false;
                    break;

            }

        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(monoHorizontal(new char[][]{{'A', 'B', 'C'}, {'X', 'X', 'X'}}, 0));
        System.out.println(monoVertical(new char[][]{{'A', 'X', 'C'}, {'X', 'X', 'X'}}, 1));
        System.out.println(extractDiagonal(new char[][]{{'A', 'A', 'C'}, {'X', 'B', 'X'}, {'A', 'A', 'C'}}));
        System.out.println(isWin(new char[][]{{' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}}));
    }
}