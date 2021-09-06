package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    int rsl = left[i];
                    System.out.println(rsl);
                }

            }

        }
    }

    public static void main(String[] args) {
        printCrossEl(new int[]{1, 2, 3}, new int[]{3, 1, 4});
    }
}

