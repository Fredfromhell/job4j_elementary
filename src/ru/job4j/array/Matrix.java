package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (row == 0) {
                    array[row][cell] = 1 + cell;
                } else {
                    array[row][cell] = row * (cell + 1);
                }

            }
        }

        return array;
    }

    public static void main(String[] args) {
        for (int[] rsl : Matrix.multiple(10)) {
            System.out.println(Arrays.toString(rsl));

        }
    }
}