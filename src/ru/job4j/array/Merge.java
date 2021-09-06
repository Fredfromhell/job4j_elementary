package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int total = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            total++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[total] = right[j];
            total++;
        }
        for (int i = 0; i + 1 < rsl.length; i++) {
            if (rsl[i] > rsl[i + 1]) {
                int temp = rsl[i];
                rsl[i] = rsl[i + 1];
                rsl[i + 1] = temp;
            }

        }

        return rsl;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 3}, new int[]{2, 4})));
    }
}

