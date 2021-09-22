package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int k = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = k++;

            }
        }
        return triangle;

    }

    public static void main(String[] args) {
        for (int[] rsl : rows(2)) {
            System.out.println(Arrays.toString(rsl));
        }
    }
}

