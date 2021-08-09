package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{5, 3, 5, 4, 3, 1, 5, 6, 7, 8, 9, 3, 6}, 6, 12));
    }
}